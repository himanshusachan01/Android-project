 package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Ninet extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    TextView t1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ninet);
        b1=(Button)findViewById(R.id.button34);
        b2=(Button)findViewById(R.id.button35);
        b3=(Button)findViewById(R.id.button36);
        b4=(Button)findViewById(R.id.button37);
        e1=(EditText) findViewById(R.id.editTextText8);
        e2=(EditText) findViewById(R.id.editTextText9);
        t1=(TextView)findViewById(R.id.textView13);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1+i2;
                t1.setText(Float.toString(i3));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1-i2;
                t1.setText(Float.toString(i3));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1*i2;
                t1.setText(Float.toString(i3));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                Float i1=Float.parseFloat(s1);
                Float i2=Float.parseFloat(s2);
                Float i3=i1/i2;
                t1.setText(Float.toString(i3));
            }
        });
    }
}