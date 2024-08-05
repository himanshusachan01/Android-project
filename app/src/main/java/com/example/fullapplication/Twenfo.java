package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Twenfo extends AppCompatActivity {
    TextView t1;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twenfo);
        String s1=Integer.toString(Twenone.score);
        t1=(TextView) findViewById(R.id.textView21);
        t1.setText(s1);
        b1=(Button) findViewById(R.id.button40);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Twenfo.this,Eleven.class);
                startActivity(i);
            }
        });
    }
}