package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class Vibrate extends AppCompatActivity {
    Button b1;
    Vibrator v1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button16);
        v1=(Vibrator) getSystemService(VIBRATOR_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT>26)
                {
                    v1.vibrate(5000);
                }
                else
                {
                    v1.vibrate(5000);
                }

            }
        });
    }
}