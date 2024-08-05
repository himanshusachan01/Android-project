package com.example.fullapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Six extends AppCompatActivity {
    EditText e1,e2;
    Button b1;
    FirebaseAuth firebaseAuth;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_six);
        e1=(EditText) findViewById(R.id.editTextText5);
        e2=(EditText) findViewById(R.id.editTextText6);
        firebaseAuth=FirebaseAuth.getInstance();
        b1=(Button) findViewById(R.id.button9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if(s1.isEmpty()){
                    e1.setError("Give proper email");
                }
                else{
                    if(s2.isEmpty()) {
                        e2.setError("Give proper password");
                    }
                    else{
                        firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Toast.makeText(Six.this, "Succesful Registered", Toast.LENGTH_SHORT).show();
                                    Intent i=new Intent(Six.this, Seven.class);
                                    startActivity(i);
                                    finish();
                                }
                                else{
                                    Toast.makeText(Six.this, "Failed Try Again", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }

            }
        });
    }
}