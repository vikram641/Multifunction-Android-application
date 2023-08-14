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

public class MainActivity extends AppCompatActivity {
    public static int score;
    Button b1,b2,b3;
    EditText e1,e2;
    ProgressBar p1;
    FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button26);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button27);
        e1=(EditText) findViewById(R.id.editTextText);
        e2=(EditText) findViewById(R.id.editTextText2);
        p1=(ProgressBar) findViewById(R.id.progressBar);
        firebaseAuth=FirebaseAuth.getInstance();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Secondreg.class);
                startActivity(i);
                finish();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(MainActivity.this, Thirdotp.class);
                startActivity(i2);
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
                    return;

                }
                else
                {
                    if (s2.isEmpty())
                    {
                        e2.setError("fill password plz");
                        return;
                    }
                    else
                    {
                        p1.setVisibility(View.INVISIBLE);
                        firebaseAuth.signInWithEmailAndPassword(s1,s2).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful())
                                {
                                    Toast.makeText(MainActivity.this, "congrats..", Toast.LENGTH_SHORT).show();
                                    p1.setVisibility(View.INVISIBLE);
                                    Intent i3=new Intent(MainActivity.this,Seven.class);
                                    startActivity(i3);
                                    finish();
                                }
                                else
                                {
                                    Toast.makeText(MainActivity.this, "try again", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });



                    }


                }

            }
        });
    }
}