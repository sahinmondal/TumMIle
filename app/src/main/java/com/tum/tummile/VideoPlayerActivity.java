package com.tum.tummile;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class VideoPlayerActivity extends AppCompatActivity {
    private VideoView videoView;
    private Button playPauseButton;
    private boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_video_player);


        videoView = findViewById(R.id.videoView);
        playPauseButton = findViewById(R.id.playPauseButton);

        String videoPath = getIntent().getStringExtra("VIDEO_URI");
        if (videoPath != null) {
            Uri videoUri = Uri.parse(videoPath);
            videoView.setVideoURI(videoUri);
            videoView.setMediaController(new MediaController(this));
            videoView.requestFocus();
            videoView.setOnPreparedListener(mp -> videoView.start());
        } else {
            Toast.makeText(this, "❌ ভিডিও লোড করতে ব্যর্থ হয়েছে!", Toast.LENGTH_SHORT).show();
            finish();
        }

        // Play/Pause button control
        playPauseButton.setOnClickListener(view -> {
            if (isPlaying) {
                videoView.pause();
                playPauseButton.setText("▶ Play");
            } else {
                videoView.start();
                playPauseButton.setText("⏸ Pause");
            }
            isPlaying = !isPlaying;
        });

        // Handle Video Completion
        videoView.setOnCompletionListener(mp -> {
            playPauseButton.setText("▶ Play");
            isPlaying = false;
        });
    }
}