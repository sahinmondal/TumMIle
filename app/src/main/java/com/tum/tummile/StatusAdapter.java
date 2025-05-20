package com.tum.tummile;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class StatusAdapter extends BaseAdapter {
    private final Context context;
    private final ArrayList<Uri> statusFiles;

    public StatusAdapter(Context context, ArrayList<Uri> statusFiles) {
        this.context = context;
        this.statusFiles = statusFiles;
    }

    @Override
    public int getCount() {
        return statusFiles.size();
    }

    @Override
    public Object getItem(int position) {
        return statusFiles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.status_item, parent, false);
            holder = new ViewHolder();
            holder.statusImage = convertView.findViewById(R.id.statusImage);
            holder.downloadButton = convertView.findViewById(R.id.downloadButton);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Uri fileUri = statusFiles.get(position);

        // Load the image with Glide (for image/video thumbnails)
        Glide.with(context).load(fileUri).into(holder.statusImage);


        // **ইমেজে ক্লিক করলে ভিডিও প্লে হবে (ভিডিও ফাইল হলে)**
        holder.statusImage.setOnClickListener(v -> {
            if (fileUri.toString().endsWith(".mp4")) {
                Intent intent = new Intent(context, VideoPlayerActivity.class);
                intent.putExtra("VIDEO_URI", fileUri.toString());
                context.startActivity(intent);
            } else {
                Toast.makeText(context, "এটি ভিডিও নয়!", Toast.LENGTH_SHORT).show();
            }
        });

        // Download button click listener
        holder.downloadButton.setOnClickListener(v -> downloadStatus(fileUri));

        return convertView;
    }


    private static class ViewHolder {
        ImageView statusImage;
        Button downloadButton;
    }

    // Download the status file
    private void downloadStatus(Uri fileUri) {
        try {
            String fileExtension = fileUri.toString().endsWith(".mp4") ? ".mp4" : ".jpg";
            String fileName = "Status_" + System.currentTimeMillis() + fileExtension;

            File targetFile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                    "TumMile/" + fileName);

            if (!targetFile.getParentFile().exists()) targetFile.getParentFile().mkdirs();

            InputStream inputStream = context.getContentResolver().openInputStream(fileUri);
            OutputStream outputStream = new FileOutputStream(targetFile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }

            outputStream.close();
            inputStream.close();

            // Notify Gallery using MediaScanner
            MediaScannerConnection.scanFile(context,
                    new String[]{targetFile.getAbsolutePath()},
                    null,
                    (path, uri) -> Log.d("MediaScan", "File scanned: " + path));

            Toast.makeText(context, "✅ স্ট্যাটাস সেভ হয়েছে!", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(context, "❌ স্ট্যাটাস সেভ করতে ব্যর্থ!", Toast.LENGTH_SHORT).show();
        }
    }
}