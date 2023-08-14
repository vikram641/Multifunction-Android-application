package com.example.mainproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class Fourotp extends AppCompatActivity {
    EditText e1;
    Button b1,b2;
    FirebaseAuth firebaseAuth;
    String phone;
    String otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourotp);
        phone=getIntent().getStringExtra("mobile").toString();
        e1=(EditText) findViewById(R.id.editTextText6);
        b1=(Button) findViewById(R.id.button7);
        b2=(Button)findViewById(R.id.button24);
        firebaseAuth=FirebaseAuth.getInstance();
        genotp();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PhoneAuthCredential credential= PhoneAuthProvider.getCredential(otp,e1.getText().toString());
                signingWithPhoneGapCredential(credential);

            }
        });
    }private void genotp()
    {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                phone,
                60,
                TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    @Override
                    public void onCodeSent(@NonNull String s, @NonNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(s, forceResendingToken);
                        otp=s;

                    }

                    @Override
                    public void onVerificationCompleted(@NonNull PhoneAuthCredential phoneAuthCredential) {
                        signingWithPhoneGapCredential(phoneAuthCredential);


                    }

                    @Override
                    public void onVerificationFailed(@NonNull FirebaseException e) {
                        Toast.makeText(Fourotp.this, "not update", Toast.LENGTH_SHORT).show();

                    }
                }


        );

    }private  void signingWithPhoneGapCredential(PhoneAuthCredential credential)
    {
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(Fourotp.this, "login", Toast.LENGTH_SHORT).show();
                    Intent i6 = new Intent(Fourotp.this,Seven.class);
                    startActivity(i6);
                    finish();
                } else {
                    Toast.makeText(Fourotp.this, "database not update ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l=new Intent(Fourotp.this,Thirdotp.class);
                startActivity(l);
                finish();
            }
        });
    }



}