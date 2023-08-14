package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Quiz3 extends AppCompatActivity {
    Button b1;
    RadioButton r1,r2,r3,r4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        b1=(Button) findViewById(R.id.button28);
        r1=(RadioButton) findViewById(R.id.radioButton5);
        r1=(RadioButton) findViewById(R.id.radioButton6);
        r1=(RadioButton) findViewById(R.id.radioButton7);
        r1=(RadioButton) findViewById(R.id.radioButton8);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (r4.isChecked())
                {
                    MainActivity.score ++;
                }
                else  {
                    MainActivity.score --;
                }
                Intent i2=new Intent(Quiz3.this,Quiz4.class);
                startActivity(i2);
            }
        });
    }
}