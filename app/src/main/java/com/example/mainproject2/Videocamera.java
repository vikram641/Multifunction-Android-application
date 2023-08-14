package com.example.mainproject2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Videocamera extends AppCompatActivity {
    Button b1;
    VideoView v1;
    MediaController m1;
    Uri u1;


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            u1= data.getData();
            v1.setVideoURI(u1);
            v1.setMediaController(m1);
            m1.setAnchorView(v1);
            v1.start();
        }
        else
        {
            Toast.makeText(this, "app not working", Toast.LENGTH_SHORT).show();
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.button22);
        v1=(VideoView) findViewById(R.id.videoView);
        m1=new MediaController(this);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i12=new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                startActivityForResult(i12,100);

            }
        });


    }
}