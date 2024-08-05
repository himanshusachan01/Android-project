package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Thirt extends AppCompatActivity {
    Button b1,b2;
    BluetoothAdapter ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_thirt);
        b1=(Button) findViewById(R.id.button28);
        b2=(Button) findViewById(R.id.button29);
        ba=BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.enable();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {

            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.disable();
            }
        });

    }
}