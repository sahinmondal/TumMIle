package com.tum.tummile;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Birthday_wishes extends AppCompatActivity {

    ListView LV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_birthday_wishes);

        LV = findViewById(R.id.LV);

        ArrayList<String> items = new ArrayList<>();
        items.add(getString(R.string.Birthday1));
        items.add(getString(R.string.Birthday2));
        items.add(getString(R.string.Birthday3));
        items.add(getString(R.string.Birthday4));
        items.add(getString(R.string.Birthday5));
        items.add(getString(R.string.Birthday6));
        items.add(getString(R.string.Birthday7));
        items.add(getString(R.string.Birthday8));
        items.add(getString(R.string.Birthday9));
        items.add(getString(R.string.Birthday10));
        items.add(getString(R.string.Birthday11));
        items.add(getString(R.string.Birthday12));
        items.add(getString(R.string.Birthday13));
        items.add(getString(R.string.Birthday14));
        items.add(getString(R.string.Birthday15));
        items.add(getString(R.string.Birthday16));
        items.add(getString(R.string.Birthday17));
        items.add(getString(R.string.Birthday18));
        items.add(getString(R.string.Birthday19));
        items.add(getString(R.string.Birthday20));
        items.add(getString(R.string.Birthday21));
        items.add(getString(R.string.Birthday22));
        items.add(getString(R.string.Birthday23));
        items.add(getString(R.string.Birthday23));
        items.add(getString(R.string.Birthday25));
        items.add(getString(R.string.Birthday26));
        items.add(getString(R.string.Birthday27));
        items.add(getString(R.string.Birthday28));
        items.add(getString(R.string.Birthday29));
        items.add(getString(R.string.Birthday30));
        items.add(getString(R.string.Birthday31));
        items.add(getString(R.string.Birthday32));
        items.add(getString(R.string.Birthday33));
        items.add(getString(R.string.Birthday34));
        items.add(getString(R.string.Birthday35));
        items.add(getString(R.string.Birthday36));
        items.add(getString(R.string.Birthday37));
        items.add(getString(R.string.Birthday38));
        items.add(getString(R.string.Birthday39));
        items.add(getString(R.string.Birthday40));
        items.add(getString(R.string.Birthday41));
        items.add(getString(R.string.Birthday42));
        items.add(getString(R.string.Birthday43));
        items.add(getString(R.string.Birthday44));
        items.add(getString(R.string.Birthday45));
        items.add(getString(R.string.Birthday46));
        items.add(getString(R.string.Birthday47));
        items.add(getString(R.string.Birthday48));
        items.add(getString(R.string.Birthday49));
        items.add(getString(R.string.Birthday50));
        items.add(getString(R.string.Birthday51));
        items.add(getString(R.string.Birthday52));
        items.add(getString(R.string.Birthday53));
        items.add(getString(R.string.Birthday54));
        items.add(getString(R.string.Birthday55));
        items.add(getString(R.string.Birthday56));
        items.add(getString(R.string.Birthday57));
        items.add(getString(R.string.Birthday58));
        items.add(getString(R.string.Birthday59));
        items.add(getString(R.string.Birthday60));
        items.add(getString(R.string.Birthday61));
        items.add(getString(R.string.Birthday62));
        items.add(getString(R.string.Birthday63));
        items.add(getString(R.string.Birthday64));
        items.add(getString(R.string.Birthday65));
        items.add(getString(R.string.Birthday66));
        items.add(getString(R.string.Birthday67));
        items.add(getString(R.string.Birthday68));
        items.add(getString(R.string.Birthday69));
        items.add(getString(R.string.Birthday70));
        items.add(getString(R.string.Birthday71));
        items.add(getString(R.string.Birthday72));
        items.add(getString(R.string.Birthday73));
        items.add(getString(R.string.Birthday74));
        items.add(getString(R.string.Birthday75));
        items.add(getString(R.string.Birthday76));
        items.add(getString(R.string.Birthday77));
        items.add(getString(R.string.Birthday78));
        items.add(getString(R.string.Birthday79));
        items.add(getString(R.string.Birthday80));
        items.add(getString(R.string.Birthday81));
        items.add(getString(R.string.Birthday82));
        items.add(getString(R.string.Birthday83));
        items.add(getString(R.string.Birthday84));
        items.add(getString(R.string.Birthday85));
        items.add(getString(R.string.Birthday86));
        items.add(getString(R.string.Birthday87));
        items.add(getString(R.string.Birthday88));
        items.add(getString(R.string.Birthday89));
        items.add(getString(R.string.Birthday90));
        items.add(getString(R.string.Birthday91));
        items.add(getString(R.string.Birthday92));
        items.add(getString(R.string.Birthday93));
        items.add(getString(R.string.Birthday94));
        items.add(getString(R.string.Birthday95));
        items.add(getString(R.string.Birthday96));
        items.add(getString(R.string.Birthday97));
        items.add(getString(R.string.Birthday98));
        items.add(getString(R.string.Birthday99));
        items.add(getString(R.string.Birthday100));
        items.add(getString(R.string.Birthday101));
        items.add(getString(R.string.Birthday102));
        items.add(getString(R.string.Birthday103));
        items.add(getString(R.string.Birthday104));
        items.add(getString(R.string.Birthday105));
        items.add(getString(R.string.Birthday106));
        items.add(getString(R.string.Birthday107));
        items.add(getString(R.string.Birthday108));
        items.add(getString(R.string.Birthday109));
        items.add(getString(R.string.Birthday110));
        items.add(getString(R.string.Birthday111));
        items.add(getString(R.string.Birthday112));
        items.add(getString(R.string.Birthday113));
        items.add(getString(R.string.Birthday114));
        items.add(getString(R.string.Birthday115));
        items.add(getString(R.string.Birthday116));
        items.add(getString(R.string.Birthday117));
        items.add(getString(R.string.Birthday118));
        items.add(getString(R.string.Birthday119));
        items.add(getString(R.string.Birthday120));
        items.add(getString(R.string.Birthday121));
        items.add(getString(R.string.Birthday122));
        items.add(getString(R.string.Birthday123));
        items.add(getString(R.string.Birthday124));
        items.add(getString(R.string.Birthday125));
        items.add(getString(R.string.Birthday126));
        items.add(getString(R.string.Birthday127));
        items.add(getString(R.string.Birthday128));
        items.add(getString(R.string.Birthday129));
        items.add(getString(R.string.Birthday130));
        items.add(getString(R.string.Birthday131));
        items.add(getString(R.string.Birthday132));
        items.add(getString(R.string.Birthday133));
        items.add(getString(R.string.Birthday134));
        items.add(getString(R.string.Birthday135));
        items.add(getString(R.string.Birthday136));
        items.add(getString(R.string.Birthday137));
        items.add(getString(R.string.Birthday138));
        items.add(getString(R.string.Birthday139));
        items.add(getString(R.string.Birthday140));
        items.add(getString(R.string.Birthday141));
        items.add(getString(R.string.Birthday142));
        items.add(getString(R.string.Birthday143));
        items.add(getString(R.string.Birthday144));
        items.add(getString(R.string.Birthday145));
        items.add(getString(R.string.Birthday146));
        items.add(getString(R.string.Birthday147));
        items.add(getString(R.string.Birthday148));
        items.add(getString(R.string.Birthday149));
        items.add(getString(R.string.Birthday150));
        items.add(getString(R.string.Birthday151));
        items.add(getString(R.string.Birthday152));
        items.add(getString(R.string.Birthday153));
        items.add(getString(R.string.Birthday154));
        items.add(getString(R.string.Birthday155));
        items.add(getString(R.string.Birthday156));
        items.add(getString(R.string.Birthday157));
        items.add(getString(R.string.Birthday158));
        items.add(getString(R.string.Birthday159));
        items.add(getString(R.string.Birthday160));
        items.add(getString(R.string.Birthday161));
        items.add(getString(R.string.Birthday162));
        items.add(getString(R.string.Birthday163));
        items.add(getString(R.string.Birthday164));
        items.add(getString(R.string.Birthday165));
        items.add(getString(R.string.Birthday166));
        items.add(getString(R.string.Birthday167));
        items.add(getString(R.string.Birthday168));
        items.add(getString(R.string.Birthday169));
        items.add(getString(R.string.Birthday170));
        items.add(getString(R.string.Birthday171));
        items.add(getString(R.string.Birthday172));
        items.add(getString(R.string.Birthday173));
        items.add(getString(R.string.Birthday174));
        items.add(getString(R.string.Birthday175));
        items.add(getString(R.string.Birthday176));
        items.add(getString(R.string.Birthday177));
        items.add(getString(R.string.Birthday178));
        items.add(getString(R.string.Birthday179));
        items.add(getString(R.string.Birthday180));
        items.add(getString(R.string.Birthday181));
        items.add(getString(R.string.Birthday182));
        items.add(getString(R.string.Birthday183));
        items.add(getString(R.string.Birthday184));
        items.add(getString(R.string.Birthday185));
        items.add(getString(R.string.Birthday186));
        items.add(getString(R.string.Birthday187));
        items.add(getString(R.string.Birthday188));
        items.add(getString(R.string.Birthday189));
        items.add(getString(R.string.Birthday190));
        items.add(getString(R.string.Birthday191));
        items.add(getString(R.string.Birthday192));
        items.add(getString(R.string.Birthday193));
        items.add(getString(R.string.Birthday194));
        items.add(getString(R.string.Birthday195));
        items.add(getString(R.string.Birthday196));
        items.add(getString(R.string.Birthday197));
        items.add(getString(R.string.Birthday198));
        items.add(getString(R.string.Birthday199));
        items.add(getString(R.string.Birthday200));


        ArrayAdapter<String> pushItems = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,items);
        LV.setAdapter(pushItems);


        // Set an item click listener
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the text of the clicked item
                String textToCopy = items.get(position);
                // Get the ClipboardManager system service
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                // Create ClipData with the text to copy
                ClipData clip = ClipData.newPlainText("text", textToCopy);
                // Set the clipboard data share send to device
                clipboard.setPrimaryClip(clip);
                // Provide feedback to the user
                Toast.makeText(Birthday_wishes.this, "Copied" + textToCopy, Toast.LENGTH_SHORT).show();
            }
        });



    }
}