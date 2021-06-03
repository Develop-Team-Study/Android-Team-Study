package com.example.sharedp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int number;

    TextView title;
    Button plus;
    Button minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        title = (TextView) findViewById(R.id.num);

        // 저장
        SharedPreferences pref = getSharedPreferences("save", MODE_PRIVATE);
        number = pref.getInt("number", 0);

        title.setText(""+number);

        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number += 1;
                title.setText(""+number);
            }
        });

        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number -= 1;
                title.setText(""+number);
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();

        SharedPreferences sharedPreferences = getSharedPreferences("save", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("number", number);

        editor.commit();
    }
}