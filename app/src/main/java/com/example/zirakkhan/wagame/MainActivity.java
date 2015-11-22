package com.example.zirakkhan.wagame;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.gesture.Gesture;
import android.media.AudioTrack;
import android.support.v4.view.GestureDetectorCompat;


public class MainActivity extends AppCompatActivity {
    TextView Start_text;
    Button Play;
    Button Set;
    public MediaPlayer intro_Sound;


    @Override
    protected void onPause() {
        super.onPause();
        intro_Sound.release();
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Play = (Button)findViewById(R.id.play);
        //Set = (Button)findViewById(R.id.settings);
        Start_text = (TextView)findViewById(R.id.start_text);


         intro_Sound = MediaPlayer.create(MainActivity.this,R.raw.intro_sound);
        intro_Sound.start();
        intro_Sound.setVolume(100,100);



    }



}
