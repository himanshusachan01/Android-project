package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Twel extends AppCompatActivity {
    Button b1,b2;
    WifiManager wf;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twel);
        b1=(Button) findViewById(R.id.button26);
        b2=(Button) findViewById(R.id.button27);
        wf=(WifiManager) getSystemService(WIFI_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
                    Intent pan=new Intent(Settings.Panel.ACTION_WIFI);
                    startActivityForResult(pan,0);
                }
                else{
                    wf.setWifiEnabled(true);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
                    Intent pan=new Intent(Settings.Panel.ACTION_WIFI);
                    startActivityForResult(pan,0);
                }
                else {
                    wf.setWifiEnabled(false);
                }
            }
        });
    }
}