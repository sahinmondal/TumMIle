package com.tum.tummile;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.widget.GridView;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;


public class Whatsapp_Status extends AppCompatActivity {

    private GridView gridView;
    private StatusAdapter statusAdapter;
    private ArrayList<Uri> statusFiles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_whatsapp_status);

        gridView = findViewById(R.id.gridView);

        // Load saved folder URI if exists
        SharedPreferences prefs = getSharedPreferences("WhatsAppStatusSaver", MODE_PRIVATE);
        String savedUri = prefs.getString("status_folder_uri", null);

        if (savedUri != null) {
            Uri folderUri = Uri.parse(savedUri);
            loadStatusesFromUri(folderUri);
        } else {
            pickWhatsAppStatusFolder(); // No folder saved, ask user to pick
        }

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Uri selectedFile = statusFiles.get(position);

            // Open video in custom player or show image
            if (selectedFile.toString().endsWith(".mp4")) {
                Intent intent = new Intent(Whatsapp_Status.this, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URI", selectedFile.toString());
                startActivity(intent);
            } else {
                Toast.makeText(Whatsapp_Status.this, "Clicked: " + selectedFile, Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Folder Picker
    private void pickWhatsAppStatusFolder() {
        Intent intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE);
        intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION);
        folderPickerLauncher.launch(intent);
    }

    // Handle the Folder Picker Result
    private final ActivityResultLauncher<Intent> folderPickerLauncher = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                    Uri treeUri = result.getData().getData();

                    // Save the URI permanently in SharedPreferences
                    saveFolderUri(treeUri);

                    // Permanently persist access permission
                    getContentResolver().takePersistableUriPermission(
                            treeUri,
                            Intent.FLAG_GRANT_READ_URI_PERMISSION
                    );

                    // Load statuses
                    loadStatusesFromUri(treeUri);
                }
            });

    // Save folder URI in SharedPreferences
    private void saveFolderUri(Uri treeUri) {
        SharedPreferences prefs = getSharedPreferences("WhatsAppStatusSaver", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("status_folder_uri", treeUri.toString());
        editor.apply();
    }

    // Load .Statuses images/videos from picked folder
    private void loadStatusesFromUri(Uri folderUri) {
        statusFiles = new ArrayList<>();
        ContentResolver contentResolver = getContentResolver();
        Uri docUri = DocumentsContract.buildChildDocumentsUriUsingTree(folderUri,
                DocumentsContract.getTreeDocumentId(folderUri));

        try (var cursor = contentResolver.query(docUri,
                new String[]{DocumentsContract.Document.COLUMN_DOCUMENT_ID, DocumentsContract.Document.COLUMN_MIME_TYPE},
                null, null, null)) {

            if (cursor != null) {
                while (cursor.moveToNext()) {
                    String docId = cursor.getString(0);
                    String mimeType = cursor.getString(1);

                    Uri fileUri = DocumentsContract.buildDocumentUriUsingTree(folderUri, docId);

                    // Filter only images and videos
                    if (mimeType != null && (mimeType.startsWith("image/") || mimeType.startsWith("video/"))) {
                        statusFiles.add(fileUri);
                    }
                }
            }

            if (statusFiles.isEmpty()) {
                Toast.makeText(this, "কোনো WhatsApp স্ট্যাটাস পাওয়া যায়নি!", Toast.LENGTH_SHORT).show();
            } else {
                statusAdapter = new StatusAdapter(this, statusFiles);
                gridView.setAdapter(statusAdapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "স্ট্যাটাস লোড করতে ব্যর্থ হয়েছে!", Toast.LENGTH_SHORT).show();
        }
    }
}
