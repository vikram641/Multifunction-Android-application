package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ToggleButton;

public class Seven extends AppCompatActivity {
    ToggleButton tb;
    CameraManager cm;
    ImageButton iv,iv2,iv3,iv4;
    Button b1, b2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
        iv=(ImageButton)findViewById(R.id.imageButton);
        iv2=(ImageButton)findViewById(R.id.imageButton2);
        iv3=(ImageButton)findViewById(R.id.imageButton3);
        iv4=(ImageButton)findViewById(R.id.imageButton4);

        b1=(Button)findViewById(R.id.button19);
        b2=(Button)findViewById(R.id.button23);
        tb=(ToggleButton) findViewById(R.id.toggleButton);
        cm=(CameraManager)getSystemService(CAMERA_SERVICE);
        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b)
                {
                    try {
                        String id=cm.getCameraIdList()[0];
                        cm.setTorchMode(id,true);
                    }
                    catch (CameraAccessException e)
                    {

                    }
                }
                else
                {
                    try {
                        String id=cm.getCameraIdList()[0];
                        cm.setTorchMode(id,false);
                    }
                    catch (CameraAccessException e)
                    {

                    }
                }

            }
        });
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i9=new Intent(Seven.this,Wifi.class);
                startActivity(i9);
                finish();
            }
        });
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i10=new Intent(Seven.this,Sixcalculator.class);
                startActivity(i10);
                finish();
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i11=new Intent(Seven.this,Camera.class);
                startActivity(i11);
                finish();
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12=new Intent(Seven.this,MainActivity.class);
                startActivity(i12);
                finish();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i13=new Intent(Seven.this, Crazy.class);
                startActivity(i13);
                finish();
            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i14=new Intent(Seven.this,Bluetooth.class);
                startActivity(i14);
                finish();
            }
        });

    }
}