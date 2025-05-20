package com.tum.tummile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class GetTouch extends AppCompatActivity {

ImageView facebook;
ImageView instagram;
ImageView twitter ;
Button privacy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_touch);

        facebook = findViewById(R.id.facebook);
        instagram = findViewById(R.id.instagram);
        twitter = findViewById(R.id.twitter);
        privacy = findViewById(R.id.privacy);


        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/sahin.mondal.808");
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl( "https://www.instagram.com/sahin.dev_professional");
            }
        });
    twitter.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotoUrl("https://x.com/Sahin_Mondal_x");
        }
    });

   privacy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            gotoUrl("https://sites.google.com/view/tummile/home");
        }
    });

    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}