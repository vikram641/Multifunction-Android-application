package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Fifthfeatures extends AppCompatActivity {
    Button b1,b2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthfeatures);
        b1=(Button) findViewById(R.id.button14);
        b2=(Button)findViewById(R.id.button15);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Fifthfeatures.this,Sixcalculator.class);
                startActivity(i7);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent(Fifthfeatures.this, Vibrate.class);
                startActivity(i8);
                finish();
            }
        });
    }
}