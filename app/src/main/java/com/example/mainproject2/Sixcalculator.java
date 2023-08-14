package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Sixcalculator extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1,b2,b3,b4,b5,b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixcalculator);
        e1=(EditText) findViewById(R.id.editTextText7);
        e2=(EditText) findViewById(R.id.editTextText8);
        b1=(Button) findViewById(R.id.button8);
        b2=(Button) findViewById(R.id.button9);
        b3=(Button) findViewById(R.id.button10);
        b4=(Button) findViewById(R.id.button11);
        b5=(Button) findViewById(R.id.button12);
        b6=(Button) findViewById(R.id.button13);
        t1=(TextView)findViewById(R.id.textView);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2=e1.getText().toString();
                String s3=e2.getText().toString();
                Integer i1=Integer.parseInt(s2);
                Integer i2=Integer.parseInt(s3);
                Integer i3=i1+i2;
                String s4=Integer.toString(i3);
                t1.setText(s4);
                Toast.makeText(Sixcalculator.this, "The result is"+s4, Toast.LENGTH_SHORT).show();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2=e1.getText().toString();
                String s3=e2.getText().toString();
                Integer i1=Integer.parseInt(s2);
                Integer i2=Integer.parseInt(s3);
                Integer i3=i1-i2;
                String s4=Integer.toString(i3);
                t1.setText(s4);
                Toast.makeText(Sixcalculator.this, "The result is"+s4, Toast.LENGTH_SHORT).show();


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2=e1.getText().toString();
                String s3=e2.getText().toString();
                Integer i1=Integer.parseInt(s2);
                Integer i2=Integer.parseInt(s3);
                Integer i3=i1*i2;
                String s4=Integer.toString(i3);
                t1.setText(s4);
                Toast.makeText(Sixcalculator.this, "The result is"+s4, Toast.LENGTH_SHORT).show();

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s2=e1.getText().toString();
                String s3=e2.getText().toString();
                Integer i1=Integer.parseInt(s2);
                Integer i2=Integer.parseInt(s3);
                Integer i3=i1/i2;
                String s4=Integer.toString(i3);
                t1.setText(s4);
                Toast.makeText(Sixcalculator.this, "The result is"+s4, Toast.LENGTH_SHORT).show();

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    t1.setText("");
                }
            }
        });




    }
}