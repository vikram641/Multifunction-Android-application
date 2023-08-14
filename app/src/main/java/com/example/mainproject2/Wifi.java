package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wifi extends AppCompatActivity {
    Button b1,b2;
    WifiManager wm;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wifi);
        b1=(Button) findViewById(R.id.button17);
        b2=(Button) findViewById(R.id.button18);
        wm=(WifiManager) getSystemService(WIFI_SERVICE);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wm.setWifiEnabled(true);

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wm.setWifiEnabled(false);
            }
        });

    }
}