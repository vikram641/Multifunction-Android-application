package com.example.mainproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hbb20.CountryCodePicker;

public class Thirdotp extends AppCompatActivity {
    CountryCodePicker ccp;
    EditText e1;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdotp);
        e1=(EditText) findViewById(R.id.editTextText5);
        ccp=(CountryCodePicker) findViewById(R.id.ccp);
        ccp.registerCarrierNumberEditText(e1);
        b1=(Button) findViewById(R.id.button6);
        b2=(Button)findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Thirdotp.this,Fourotp.class);
                i5.putExtra("mobile",ccp.getFullNumberWithPlus().trim());
                startActivity(i5);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k=new Intent(Thirdotp.this,Secondreg.class);
                startActivity(k);
                finish();
            }
        });


    }
}


