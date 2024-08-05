package com.example.fullapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Nine extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nine);
        b1=(Button) findViewById(R.id.button13);
        b2=(Button) findViewById(R.id.button14);
        b3=(Button) findViewById(R.id.button16);
        b4=(Button) findViewById(R.id.button15);
        b5=(Button) findViewById(R.id.button18);
        b6=(Button) findViewById(R.id.button17);
        b7=(Button) findViewById(R.id.button19);
        b8=(Button) findViewById(R.id.button20);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Nine.this,Twel.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Nine.this,Thirt.class);
                startActivity(i1);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Nine.this,Fourt.class);
                startActivity(i2);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Nine.this,Fifth.class);
                startActivity(i3);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Nine.this,Sixt.class);
                startActivity(i4);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Nine.this,Sevent.class);
                startActivity(i5);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Nine.this,Eighte.class);
                startActivity(i6);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Nine.this,Ninet.class);
                startActivity(i7);
            }
        });
    }
}