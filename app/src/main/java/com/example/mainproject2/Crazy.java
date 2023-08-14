package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Crazy extends AppCompatActivity {
    ImageButton ib1,ib2,ib3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crazy);
        ib1=(ImageButton) findViewById(R.id.imageButton5);
        ib2=(ImageButton) findViewById(R.id.imageButton6);
        ib3=(ImageButton) findViewById(R.id.imageButton8);
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14=new Intent(Crazy.this,Music.class);
                startActivity(i14);
                finish();

            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i15=new Intent(Crazy.this,Vibrate.class);
                startActivity(i15);
                finish();
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i18=new Intent(Crazy.this,Quiz.class);
                startActivity(i18);
                finish();
            }
        });
    }
}