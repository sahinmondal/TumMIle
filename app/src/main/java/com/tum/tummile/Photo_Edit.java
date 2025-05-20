package com.tum.tummile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Photo_Edit extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_photo_edit);

        setupButton(R.id.downloadButton, "Downloading Image...");
        setupButton(R.id.clearFaceButton, "Clear Face Activated!");
        setupButton(R.id.blurBackgroundButton, "Blur Background Activated!");
        setupButton(R.id.faceSlimmingButton, "Face Slimming Activated!");
        setupButton(R.id.teethWhiteningButton, "Teeth Whitening Activated!");
        setupButton(R.id.darkCircleButton, "Dark Circle Removal Activated!");
        setupButton(R.id.skinSmoothingButton, "Skin Smoothing Activated!");
        setupButton(R.id.brighteningButton, "Brightening Activated!");
        setupButton(R.id.glowEffectButton, "Glow Effect Activated!");
        setupButton(R.id.makeupButton, "AI Makeup Activated!");
        setupButton(R.id.lipColorButton, "Lip Color Enhance Activated!");
        setupButton(R.id.hairColorButton, "Hair Color Change Activated!");
        setupButton(R.id.eyeColorButton, "Eye Color Change Activated!");
        setupButton(R.id.blushButton, "Blush Control Activated!");
        setupButton(R.id.skinToneButton, "Skin Tone Adjust Activated!");
    }

    private void setupButton(int buttonId, String message) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> Toast.makeText(this, message, Toast.LENGTH_SHORT).show());
    }
}
