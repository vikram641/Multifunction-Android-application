package com.example.mainproject2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Secondreg extends AppCompatActivity {
    Button b1,b2,b3;
    EditText e1,e2;
    FirebaseAuth firebaseAuth;
    ProgressBar p1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondreg);
        b1=(Button) findViewById(R.id.button29);
        b2=(Button) findViewById(R.id.button5);
        b3=(Button) findViewById(R.id.button5);

        e1=(EditText) findViewById(R.id.editTextText3);
        e2=(EditText) findViewById(R.id.editTextText4);
        p1=(ProgressBar) findViewById(R.id.progressBar2);
        firebaseAuth=FirebaseAuth.getInstance();
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n=new Intent(Secondreg.this,MainActivity.class);
                startActivity(n);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Secondreg.this,MainActivity.class);
                startActivity(i4);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                if (s1.isEmpty())
                {
                    e1.setError("fill email plz");
                }
                else
                {
                    if (s2.isEmpty())
                    {

                        e2.setError("fill password plz");
                    }
                    else
                    {
                        p1.setVisibility(View.INVISIBLE);
                        firebaseAuth.createUserWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    Toast.makeText(Secondreg.this, "register successful", Toast.LENGTH_SHORT).show();
                                    p1.setVisibility(View.INVISIBLE);
                                }
                                else
                                {
                                    Toast.makeText(Secondreg.this, "sorry try again", Toast.LENGTH_SHORT).show();
                                    p1.setVisibility(View.INVISIBLE);
                                    Intent i2=new Intent(Secondreg.this,MainActivity.class);
                                    startActivity(i2);
                                    finish();

                                }

                            }
                        });
                    }
                }
            }
        });

    }
}