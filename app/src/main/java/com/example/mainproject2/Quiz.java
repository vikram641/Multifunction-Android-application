package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz extends AppCompatActivity {
    Button b1;
    RadioButton r1, r2,r3,r4;
    static int score=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button26);
        r1=(RadioButton) findViewById(R.id.radioButton8);
        r1=(RadioButton) findViewById(R.id.radioButton9);
        r1=(RadioButton) findViewById(R.id.radioButton10);
        r1=(RadioButton) findViewById(R.id.radioButton11);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if (r3.isChecked())
                {
                    score++;
                }
                else
                {
                    score--;

                }
                Intent i=new Intent(Quiz.this,Quiz2.class);
                startActivity(i);
            }
        });


    }
}