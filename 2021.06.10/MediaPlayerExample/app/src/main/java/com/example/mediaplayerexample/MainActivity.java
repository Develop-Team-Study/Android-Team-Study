package com.example.mediaplayerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_start;
    Button btn_stop;

    MediaPlayer background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        background = MediaPlayer.create(getBaseContext(), R.raw.music);

        btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background = MediaPlayer.create(getBaseContext(), R.raw.music);
                background.start();
                background.setLooping(true);
            }
        });


        btn_stop = (Button) findViewById(R.id.btn_stop);
        btn_stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.stop();
            }
        });
    }
}