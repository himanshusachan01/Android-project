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
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Eight extends AppCompatActivity {
    Button b2;
    EditText e1;
    FirebaseAuth firebaseAuth;
    String phone;
    String otp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_eight);
        phone=getIntent().getStringExtra("P").toString();
        b2=(Button) findViewById(R.id.button12);
        e1=(EditText) findViewById(R.id.editTextText4);
        firebaseAuth= FirebaseAuth.getInstance();
        genotp();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                if(s1.isEmpty()){
                    Toast.makeText(Eight.this, "Full Otp", Toast.LENGTH_SHORT).show();
                }
                else{
                    if(s1.length()!=6){
                        Toast.makeText(Eight.this, "Fill Correct Output", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        PhoneAuthCredential credential= PhoneAuthProvider.getCredential(otp,s1);
                        SignInWithPhoneAuthCredential(credential);

                    }
                }
            }
        });

    }
    private void genotp(){
        PhoneAuthProvider.getInstance().verifyPhoneNumber(phone, 60, TimeUnit.SECONDS, this, new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                super.onCodeSent(s, forceResendingToken);
                otp=s;
            }

            @Override
            public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                SignInWithPhoneAuthCredential(phoneAuthCredential);
            }

            @Override
            public void onVerificationFailed(@NonNull FirebaseException e) {
                Toast.makeText(Eight.this, "Otp mismatch", Toast.LENGTH_SHORT).show();

            }
        });
    }
    private void SignInWithPhoneAuthCredential(PhoneAuthCredential credential){
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(Eight.this, "Otp matched", Toast.LENGTH_SHORT).show();
                    Intent t=new Intent(Eight.this,Seven.class);
                    startActivity(t);
                }
                else{
                    Toast.makeText(Eight.this, "Unsccesful!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}