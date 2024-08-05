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

public class Twentwen extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_twentwen);
        r1=(RadioButton) findViewById(R.id.radioButton5);
        r2=(RadioButton) findViewById(R.id.radioButton6);
        r3=(RadioButton) findViewById(R.id.radioButton7);
        r4=(RadioButton) findViewById(R.id.radioButton8);
        b1=(Button) findViewById(R.id.button42);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r3.isChecked()){
                    ++Twenone.score;
                }
                else{
                    --Twenone.score;
                }
                Intent i=new Intent( Twentwen.this,Twenthr.class);
                startActivity(i);
            }
        });
    }
}