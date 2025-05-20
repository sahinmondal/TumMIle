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

public class EidMubarak_wishes extends AppCompatActivity {

    ListView LV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eid_mubarak);


        LV = findViewById(R.id.LV);


        ArrayList<String> items = new ArrayList<>();
        items.add(getString(R.string.EidMubarak1));
        items.add(getString(R.string.EidMubarak2));
        items.add(getString(R.string.EidMubarak3));
        items.add(getString(R.string.EidMubarak4));
        items.add(getString(R.string.EidMubarak5));
        items.add(getString(R.string.EidMubarak6));
        items.add(getString(R.string.EidMubarak7));
        items.add(getString(R.string.EidMubarak8));
        items.add(getString(R.string.EidMubarak9));
        items.add(getString(R.string.EidMubarak10));
        items.add(getString(R.string.EidMubarak11));
        items.add(getString(R.string.EidMubarak12));
        items.add(getString(R.string.EidMubarak13));
        items.add(getString(R.string.EidMubarak14));
        items.add(getString(R.string.EidMubarak15));
        items.add(getString(R.string.EidMubarak16));
        items.add(getString(R.string.EidMubarak17));
        items.add(getString(R.string.EidMubarak18));
        items.add(getString(R.string.EidMubarak19));
        items.add(getString(R.string.EidMubarak20));
        items.add(getString(R.string.EidMubarak21));
        items.add(getString(R.string.EidMubarak22));
        items.add(getString(R.string.EidMubarak23));
        items.add(getString(R.string.EidMubarak24));
        items.add(getString(R.string.EidMubarak25));
        items.add(getString(R.string.EidMubarak26));
        items.add(getString(R.string.EidMubarak27));
        items.add(getString(R.string.EidMubarak28));
        items.add(getString(R.string.EidMubarak29));
        items.add(getString(R.string.EidMubarak30));
        items.add(getString(R.string.EidMubarak31));
        items.add(getString(R.string.EidMubarak32));
        items.add(getString(R.string.EidMubarak33));
        items.add(getString(R.string.EidMubarak34));
        items.add(getString(R.string.EidMubarak35));
        items.add(getString(R.string.EidMubarak36));
        items.add(getString(R.string.EidMubarak37));
        items.add(getString(R.string.EidMubarak38));
        items.add(getString(R.string.EidMubarak39));
        items.add(getString(R.string.EidMubarak40));
        items.add(getString(R.string.EidMubarak41));
        items.add(getString(R.string.EidMubarak42));
        items.add(getString(R.string.EidMubarak43));
        items.add(getString(R.string.EidMubarak44));
        items.add(getString(R.string.EidMubarak45));
        items.add(getString(R.string.EidMubarak46));
        items.add(getString(R.string.EidMubarak47));
        items.add(getString(R.string.EidMubarak48));
        items.add(getString(R.string.EidMubarak49));
        items.add(getString(R.string.EidMubarak50));
        items.add(getString(R.string.EidMubarak51));
        items.add(getString(R.string.EidMubarak52));
        items.add(getString(R.string.EidMubarak53));
        items.add(getString(R.string.EidMubarak54));
        items.add(getString(R.string.EidMubarak55));
        items.add(getString(R.string.EidMubarak56));
        items.add(getString(R.string.EidMubarak57));
        items.add(getString(R.string.EidMubarak58));
        items.add(getString(R.string.EidMubarak59));
        items.add(getString(R.string.EidMubarak60));
        items.add(getString(R.string.EidMubarak61));
        items.add(getString(R.string.EidMubarak62));
        items.add(getString(R.string.EidMubarak63));
        items.add(getString(R.string.EidMubarak64));
        items.add(getString(R.string.EidMubarak65));
        items.add(getString(R.string.EidMubarak66));
        items.add(getString(R.string.EidMubarak67));
        items.add(getString(R.string.EidMubarak68));
        items.add(getString(R.string.EidMubarak69));
        items.add(getString(R.string.EidMubarak70));
        items.add(getString(R.string.EidMubarak71));
        items.add(getString(R.string.EidMubarak72));
        items.add(getString(R.string.EidMubarak73));
        items.add(getString(R.string.EidMubarak74));
        items.add(getString(R.string.EidMubarak75));
        items.add(getString(R.string.EidMubarak76));
        items.add(getString(R.string.EidMubarak77));
        items.add(getString(R.string.EidMubarak78));
        items.add(getString(R.string.EidMubarak79));
        items.add(getString(R.string.EidMubarak80));
        items.add(getString(R.string.EidMubarak81));
        items.add(getString(R.string.EidMubarak82));
        items.add(getString(R.string.EidMubarak83));
        items.add(getString(R.string.EidMubarak84));
        items.add(getString(R.string.EidMubarak85));
        items.add(getString(R.string.EidMubarak86));
        items.add(getString(R.string.EidMubarak87));
        items.add(getString(R.string.EidMubarak88));
        items.add(getString(R.string.EidMubarak89));
        items.add(getString(R.string.EidMubarak90));
        items.add(getString(R.string.EidMubarak91));
        items.add(getString(R.string.EidMubarak92));
        items.add(getString(R.string.EidMubarak93));
        items.add(getString(R.string.EidMubarak94));
        items.add(getString(R.string.EidMubarak95));
        items.add(getString(R.string.EidMubarak96));
        items.add(getString(R.string.EidMubarak97));
        items.add(getString(R.string.EidMubarak98));
        items.add(getString(R.string.EidMubarak99));
        items.add(getString(R.string.EidMubarak100));
        items.add(getString(R.string.EidMubarak101));
        items.add(getString(R.string.EidMubarak102));
        items.add(getString(R.string.EidMubarak103));
        items.add(getString(R.string.EidMubarak104));
        items.add(getString(R.string.EidMubarak105));
        items.add(getString(R.string.EidMubarak106));
        items.add(getString(R.string.EidMubarak107));
        items.add(getString(R.string.EidMubarak108));
        items.add(getString(R.string.EidMubarak109));
        items.add(getString(R.string.EidMubarak110));
        items.add(getString(R.string.EidMubarak111));
        items.add(getString(R.string.EidMubarak112));
        items.add(getString(R.string.EidMubarak113));
        items.add(getString(R.string.EidMubarak114));
        items.add(getString(R.string.EidMubarak115));
        items.add(getString(R.string.EidMubarak116));
        items.add(getString(R.string.EidMubarak117));
        items.add(getString(R.string.EidMubarak118));
        items.add(getString(R.string.EidMubarak119));
        items.add(getString(R.string.EidMubarak120));
        items.add(getString(R.string.EidMubarak121));
        items.add(getString(R.string.EidMubarak122));
        items.add(getString(R.string.EidMubarak123));
        items.add(getString(R.string.EidMubarak124));
        items.add(getString(R.string.EidMubarak125));
        items.add(getString(R.string.EidMubarak126));
        items.add(getString(R.string.EidMubarak127));
        items.add(getString(R.string.EidMubarak128));
        items.add(getString(R.string.EidMubarak129));
        items.add(getString(R.string.EidMubarak130));
        items.add(getString(R.string.EidMubarak131));
        items.add(getString(R.string.EidMubarak132));
        items.add(getString(R.string.EidMubarak133));
        items.add(getString(R.string.EidMubarak134));
        items.add(getString(R.string.EidMubarak135));
        items.add(getString(R.string.EidMubarak136));
        items.add(getString(R.string.EidMubarak137));
        items.add(getString(R.string.EidMubarak138));
        items.add(getString(R.string.EidMubarak139));
        items.add(getString(R.string.EidMubarak140));
        items.add(getString(R.string.EidMubarak141));
        items.add(getString(R.string.EidMubarak142));
        items.add(getString(R.string.EidMubarak143));
        items.add(getString(R.string.EidMubarak144));
        items.add(getString(R.string.EidMubarak145));
        items.add(getString(R.string.EidMubarak146));
        items.add(getString(R.string.EidMubarak147));
        items.add(getString(R.string.EidMubarak148));
        items.add(getString(R.string.EidMubarak149));
        items.add(getString(R.string.EidMubarak150));
        items.add(getString(R.string.EidMubarak151));
        items.add(getString(R.string.EidMubarak152));
        items.add(getString(R.string.EidMubarak153));
        items.add(getString(R.string.EidMubarak154));
        items.add(getString(R.string.EidMubarak155));
        items.add(getString(R.string.EidMubarak156));
        items.add(getString(R.string.EidMubarak157));
        items.add(getString(R.string.EidMubarak158));
        items.add(getString(R.string.EidMubarak159));
        items.add(getString(R.string.EidMubarak160));
        items.add(getString(R.string.EidMubarak161));
        items.add(getString(R.string.EidMubarak162));
        items.add(getString(R.string.EidMubarak163));
        items.add(getString(R.string.EidMubarak164));
        items.add(getString(R.string.EidMubarak165));
        items.add(getString(R.string.EidMubarak166));
        items.add(getString(R.string.EidMubarak167));
        items.add(getString(R.string.EidMubarak168));
        items.add(getString(R.string.EidMubarak169));
        items.add(getString(R.string.EidMubarak170));
        items.add(getString(R.string.EidMubarak171));
        items.add(getString(R.string.EidMubarak172));
        items.add(getString(R.string.EidMubarak173));
        items.add(getString(R.string.EidMubarak174));
        items.add(getString(R.string.EidMubarak175));
        items.add(getString(R.string.EidMubarak176));
        items.add(getString(R.string.EidMubarak177));
        items.add(getString(R.string.EidMubarak178));
        items.add(getString(R.string.EidMubarak179));
        items.add(getString(R.string.EidMubarak180));
        items.add(getString(R.string.EidMubarak181));
        items.add(getString(R.string.EidMubarak182));
        items.add(getString(R.string.EidMubarak183));
        items.add(getString(R.string.EidMubarak184));
        items.add(getString(R.string.EidMubarak185));
        items.add(getString(R.string.EidMubarak186));
        items.add(getString(R.string.EidMubarak187));
        items.add(getString(R.string.EidMubarak188));
        items.add(getString(R.string.EidMubarak189));
        items.add(getString(R.string.EidMubarak190));
        items.add(getString(R.string.EidMubarak191));
        items.add(getString(R.string.EidMubarak192));
        items.add(getString(R.string.EidMubarak193));
        items.add(getString(R.string.EidMubarak194));
        items.add(getString(R.string.EidMubarak195));
        items.add(getString(R.string.EidMubarak196));
        items.add(getString(R.string.EidMubarak197));
        items.add(getString(R.string.EidMubarak198));
        items.add(getString(R.string.EidMubarak199));
        items.add(getString(R.string.EidMubarak200));
        items.add(getString(R.string.EidMubarak201));
        items.add(getString(R.string.EidMubarak202));
        items.add(getString(R.string.EidMubarak203));
        items.add(getString(R.string.EidMubarak204));
        items.add(getString(R.string.EidMubarak205));
        items.add(getString(R.string.EidMubarak206));
        items.add(getString(R.string.EidMubarak207));
        items.add(getString(R.string.EidMubarak208));
        items.add(getString(R.string.EidMubarak209));
        items.add(getString(R.string.EidMubarak210));
        items.add(getString(R.string.EidMubarak211));
        items.add(getString(R.string.EidMubarak212));
        items.add(getString(R.string.EidMubarak213));
        items.add(getString(R.string.EidMubarak214));
        items.add(getString(R.string.EidMubarak215));
        items.add(getString(R.string.EidMubarak216));
        items.add(getString(R.string.EidMubarak217));
        items.add(getString(R.string.EidMubarak218));
        items.add(getString(R.string.EidMubarak219));
        items.add(getString(R.string.EidMubarak220));
        items.add(getString(R.string.EidMubarak221));
        items.add(getString(R.string.EidMubarak222));
        items.add(getString(R.string.EidMubarak223));
        items.add(getString(R.string.EidMubarak224));
        items.add(getString(R.string.EidMubarak225));
        items.add(getString(R.string.EidMubarak226));
        items.add(getString(R.string.EidMubarak227));
        items.add(getString(R.string.EidMubarak228));
        items.add(getString(R.string.EidMubarak229));
        items.add(getString(R.string.EidMubarak230));
        items.add(getString(R.string.EidMubarak231));
        items.add(getString(R.string.EidMubarak232));
        items.add(getString(R.string.EidMubarak233));
        items.add(getString(R.string.EidMubarak234));
        items.add(getString(R.string.EidMubarak235));
        items.add(getString(R.string.EidMubarak236));
        items.add(getString(R.string.EidMubarak237));
        items.add(getString(R.string.EidMubarak238));
        items.add(getString(R.string.EidMubarak239));
        items.add(getString(R.string.EidMubarak240));
        items.add(getString(R.string.EidMubarak241));
        items.add(getString(R.string.EidMubarak242));
        items.add(getString(R.string.EidMubarak243));
        items.add(getString(R.string.EidMubarak244));
        items.add(getString(R.string.EidMubarak245));
        items.add(getString(R.string.EidMubarak246));
        items.add(getString(R.string.EidMubarak247));
        items.add(getString(R.string.EidMubarak248));
        items.add(getString(R.string.EidMubarak249));
        items.add(getString(R.string.EidMubarak250));
        items.add(getString(R.string.EidMubarak251));
        items.add(getString(R.string.EidMubarak252));
        items.add(getString(R.string.EidMubarak253));
        items.add(getString(R.string.EidMubarak254));
        items.add(getString(R.string.EidMubarak255));
        items.add(getString(R.string.EidMubarak256));
        items.add(getString(R.string.EidMubarak257));
        items.add(getString(R.string.EidMubarak258));
        items.add(getString(R.string.EidMubarak259));
        items.add(getString(R.string.EidMubarak260));
        items.add(getString(R.string.EidMubarak261));
        items.add(getString(R.string.EidMubarak262));
        items.add(getString(R.string.EidMubarak263));
        items.add(getString(R.string.EidMubarak264));
        items.add(getString(R.string.EidMubarak265));
        items.add(getString(R.string.EidMubarak266));
        items.add(getString(R.string.EidMubarak267));
        items.add(getString(R.string.EidMubarak268));
        items.add(getString(R.string.EidMubarak269));
        items.add(getString(R.string.EidMubarak270));
        items.add(getString(R.string.EidMubarak271));
        items.add(getString(R.string.EidMubarak272));
        items.add(getString(R.string.EidMubarak273));
        items.add(getString(R.string.EidMubarak274));
        items.add(getString(R.string.EidMubarak275));
        items.add(getString(R.string.EidMubarak276));
        items.add(getString(R.string.EidMubarak277));
        items.add(getString(R.string.EidMubarak278));
        items.add(getString(R.string.EidMubarak279));
        items.add(getString(R.string.EidMubarak280));
        items.add(getString(R.string.EidMubarak281));
        items.add(getString(R.string.EidMubarak282));
        items.add(getString(R.string.EidMubarak283));
        items.add(getString(R.string.EidMubarak284));
        items.add(getString(R.string.EidMubarak285));
        items.add(getString(R.string.EidMubarak286));
        items.add(getString(R.string.EidMubarak287));
        items.add(getString(R.string.EidMubarak288));
        items.add(getString(R.string.EidMubarak289));
        items.add(getString(R.string.EidMubarak290));
        items.add(getString(R.string.EidMubarak291));
        items.add(getString(R.string.EidMubarak292));
        items.add(getString(R.string.EidMubarak293));
        items.add(getString(R.string.EidMubarak294));
        items.add(getString(R.string.EidMubarak295));
        items.add(getString(R.string.EidMubarak296));
        items.add(getString(R.string.EidMubarak297));
        items.add(getString(R.string.EidMubarak298));
        items.add(getString(R.string.EidMubarak299));
        items.add(getString(R.string.EidMubarak300));



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
                Toast.makeText(EidMubarak_wishes.this, "Copied" + textToCopy, Toast.LENGTH_SHORT).show();
            }
        });





    }
}