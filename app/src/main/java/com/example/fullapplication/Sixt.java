package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sixt extends AppCompatActivity {
    VideoView v1;
    MediaController s1;
    Uri u1;
    Button b1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sixt);
        b1 = (Button) findViewById(R.id.button45);
        v1 = (VideoView) findViewById(R.id.videoView);
        s1 = new MediaController(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i,99);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,@Nullable Intent data) {
        super.onActivityResult(requestCode,resultCode, data);
        if (requestCode == 99) {
            u1 = data.getData();
            v1.setMediaController(s1);
            s1.setAnchorView(v1);
            v1.setVideoURI(u1);
            v1.start();

        }
        else {
            Toast.makeText(this, "Something went wrong !!", Toast.LENGTH_SHORT).show();
        }
    }
}