package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bluetooth extends AppCompatActivity {
    Button b1,b2,b3;
    BluetoothAdapter ba;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth);
        b1=(Button) findViewById(R.id.button20);
        b2=(Button) findViewById(R.id.button21);
        b3=(Button)findViewById(R.id.button25);
        ba=BluetoothAdapter.getDefaultAdapter();
        b1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.enable();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                ba.disable();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent u=new Intent(Bluetooth.this,Seven.class);
                startActivity(u);
                finish();
            }
        });





    }
}