package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Sevent extends AppCompatActivity {
    ToggleButton t3;
    CameraManager cm;
    Boolean torch =false;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sevent);
        cm = (CameraManager)getSystemService(CAMERA_SERVICE);
        t3=(ToggleButton)findViewById(R.id.toggleButton);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (torch == false){
                    try {
                        String s1 = cm.getCameraIdList()[0];
                        cm.setTorchMode(s1,true);
                    }
                    catch (CameraAccessException e){

                    }
                    torch = true;
                }
                else{
                    try {
                        String s1 = cm.getCameraIdList()[0];
                        cm.setTorchMode(s1,false);
                    }
                    catch (CameraAccessException e){

                    }
                    torch = false;

                }

            }
        });
    }
}