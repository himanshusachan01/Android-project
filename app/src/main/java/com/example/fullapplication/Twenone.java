package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Twenone extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;
    static int score=0;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twenone);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r2=(RadioButton) findViewById(R.id.radioButton2);
        r3=(RadioButton) findViewById(R.id.radioButton3);
        r4=(RadioButton) findViewById(R.id.radioButton4);
        b1=(Button) findViewById(R.id.button41);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r1.isChecked()){
                    ++score;
                }
                else{
                    --score;
                }
                Intent i=new Intent(Twenone.this, Twentwen.class);
                startActivity(i);
            }
        });

    }
}