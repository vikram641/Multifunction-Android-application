package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz2 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);
        b1=(Button) findViewById(R.id.button27);
        r1=(RadioButton) findViewById(R.id.radioButton);
        r1=(RadioButton) findViewById(R.id.radioButton2);
        r1=(RadioButton) findViewById(R.id.radioButton3);
        r1=(RadioButton) findViewById(R.id.radioButton4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r4.isChecked())
                {
                    MainActivity. score++;

                }
                else
                {
                    MainActivity.score--;

                }
                Intent j=new Intent(Quiz2.this,Quiz3.class);
                startActivity(j);
            }
        });

    }
}