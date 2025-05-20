package com.tum.tummile;


import android.content.Intent;
import android.util.Log;
import android.widget.Button;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import co.mobiwise.materialintro.shape.Focus;
import co.mobiwise.materialintro.shape.FocusGravity;
import co.mobiwise.materialintro.shape.ShapeType;
import co.mobiwise.materialintro.view.MaterialIntroView;

public class MainActivity extends AppCompatActivity {

    private AdView adView;
    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnEClick = findViewById(R.id.btnEClick);
        Button btnBClick = findViewById(R.id.btnBClick);
        Button btnHClick = findViewById(R.id.btnHClick);
        Button eidmubakar = findViewById(R.id.eid_wish);
        Button birthday = findViewById(R.id.birthday_wishes);
        Button fontchange = findViewById(R.id.font_change);
        Button btnPickFolder = findViewById(R.id.btnPickFolder);
        Button aboutClick = findViewById(R.id.aboutClick);
        Button photoedit = findViewById(R.id.photoedit);

        // Initialize AdMob
        MobileAds.initialize(this, initializationStatus -> {});

        // Load Banner Ad
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        // Load Interstitial Ad
        InterstitialAd.load(this, "ca-app-pub-7832903149087002/5840845969", adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                        Log.d("AdMob", "Interstitial Ad Loaded");

                        // Show interstitial after load (or trigger on button click)
                        mInterstitialAd.show(MainActivity.this);
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        Log.d("AdMob", "Interstitial Failed: " + loadAdError.getMessage());
                        mInterstitialAd = null;
                    }
                });


        btnEClick.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EnglishQuatees.class);
            startActivity(intent);
        });

        btnBClick.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, BengaliQuatees.class);
            startActivity(intent);
        });
        btnHClick.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, HindiQuatees.class);
            startActivity(intent);
        });
       eidmubakar.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, EidMubarak_wishes.class);
            startActivity(intent);
        });

       birthday.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Birthday_wishes.class);
            startActivity(intent);
        });

       fontchange.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Font_changer.class);
            startActivity(intent);
        });
        //for show case
        new MaterialIntroView.Builder(this)
                .enableDotAnimation(true)
                .enableIcon(false)
                .setFocusGravity(FocusGravity.CENTER)
                .setFocusType(Focus.MINIMUM)
                .setDelayMillis(500)
                .enableFadeAnimation(true)
                .performClick(true)
                .setInfoText("Select Folder Android/media/com.whatsapp/WhatsApp/Media/.Statuses And USE THIS FOLDER ALLOW করুন")
                .setShape(ShapeType.CIRCLE)
                .setTarget(btnPickFolder)
                .setUsageId("intro_pick_folder") // ✅ আলাদা Usage ID দিতে হবে
                .show();

        btnPickFolder.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Whatsapp_Status.class);
            startActivity(intent);
        });


        aboutClick.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, GetTouch.class);
            startActivity(intent);
        });

        photoedit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,Photo_Edit.class);
            startActivity(intent);
        });



    }
}