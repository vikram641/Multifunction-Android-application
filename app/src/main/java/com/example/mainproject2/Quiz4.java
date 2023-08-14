package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Quiz4 extends AppCompatActivity {
    Button b1;
    TextView t1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        b1=(Button) findViewById(R.id.button29);
        t1=(TextView) findViewById(R.id.textView5);
        t1.setText("you score is " +Quiz.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Quiz4.this,Quiz.class);
                startActivity(i);
                finish();
            }
        });

    }
}