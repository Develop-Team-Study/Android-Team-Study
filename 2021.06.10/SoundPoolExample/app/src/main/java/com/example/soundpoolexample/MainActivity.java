package com.example.soundpoolexample;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton monster;
    SoundPool sound_coin = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int soundld = sound_coin.load(this, R.raw.sound_coin, 1);

        monster = (ImageButton) findViewById(R.id.ib_monster);
        monster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sound_coin.play(soundld, 1F, 1F, 0, 0, 1F);
            }
        });
    }
}