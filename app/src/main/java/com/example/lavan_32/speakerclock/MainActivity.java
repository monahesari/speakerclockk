package com.example.lavan_32.speakerclock;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.util.Date;


public class MainActivity extends AppCompatActivity {
    int[] songs;
    int current_index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText t1 = (EditText) findViewById(R.id.mm);
        Button b = (Button) findViewById(R.id.b1);
        songs = new int[]{R.raw.recording1, R.raw.recording1o, R.raw.recording2, R.raw.recording2o,
                R.raw.recording3, R.raw.recording3o, R.raw.recording4, R.raw.recording4o,
                R.raw.recording5, R.raw.recording5o, R.raw.recording6, R.raw.recording6o,
                R.raw.recording7, R.raw.recording7o, R.raw.recording8, R.raw.recording8o,
                R.raw.recording9, R.raw.recording9o, R.raw.recording10, R.raw.recording10o,
                R.raw.recording11, R.raw.recording11o, R.raw.recording12, R.raw.recording12o,
                R.raw.recording13, R.raw.recording13o, R.raw.recording14, R.raw.recording14o,
                R.raw.recording15, R.raw.recording15o, R.raw.recording16, R.raw.recording16o,
                R.raw.recording17, R.raw.recording17o, R.raw.recording18, R.raw.recording18o,
                R.raw.recording19, R.raw.recording19o, R.raw.recording20, R.raw.recording20o,
                R.raw.recording30, R.raw.recording30o, R.raw.recording40, R.raw.recording40o,
                R.raw.recording50, R.raw.recording50o, R.raw.recordingdaghighe, R.raw.recordingdaghigheo,
                R.raw.recording1, R.raw.recording1o, R.raw.recording2, R.raw.recording2o,
                R.raw.recordingsaat, R.raw.recordingsanie};

        final MediaPlayer mp = MediaPlayer.create(this, songs[0]);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*نمایش ساعت*/
                Date d = new Date();
                int hour = d.getHours();
                int minute = d.getMinutes();
                int secound = d.getSeconds();
                t1.setText(hour + minute + secound);

                /*صوت*/
                mp.setOnCompletionListener(this);
                mp.start();
                current_index =(current_index +1)%50;


            }
        });


    }}




