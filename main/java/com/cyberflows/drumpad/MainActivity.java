package com.cyberflows.drumpad;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   // private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    private SoundPool pools;
    private int drum1,drum2,drum3,drum4,drum5,drum6,drum7,drum8,drum9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pools = new SoundPool(2, AudioManager.STREAM_MUSIC, 0);
        drum1 = pools.load(getApplicationContext(), R.raw.drum1, 1);
        drum2 = pools.load(getApplicationContext(), R.raw.drum2, 1);
        drum3 = pools.load(getApplicationContext(), R.raw.drum3, 1);
        drum4 = pools.load(getApplicationContext(), R.raw.drum4, 1);
        drum5 = pools.load(getApplicationContext(), R.raw.drum5, 1);
        drum6 = pools.load(getApplicationContext(), R.raw.drum6, 1);
        drum7 = pools.load(getApplicationContext(), R.raw.drum7, 1);
        drum8 = pools.load(getApplicationContext(), R.raw.drum8, 1);
        drum9 = pools.load(getApplicationContext(), R.raw.drum9, 1);

    }
    public void playsound1 (View v) {
        pools.play(drum1,1.0f,1.0f,0,0,10f);
    }
    public void playsound2 (View v) {
        pools.play(drum2,1.0f,1.0f,0,0,10f);

    }
    public void playsound3 (View v) {
        pools.play(drum3,1.0f,1.0f,0,0,10f);

    }
    public void playsound4 (View v) {
        pools.play(drum4,1.0f,1.0f,0,0,10f);

    }
    public void playsound5 (View v) {
        pools.play(drum5,1.0f,1.0f,0,0,10f);

    }
    public void playsound6 (View v) {
        pools.play(drum6,1.0f,1.0f,0,0,10f);

    }
    public void playsound7 (View v) {
        pools.play(drum7,1.0f,1.0f,0,0,10f);

    }
    public void playsound8 (View v) {
        pools.play(drum8,1.0f,1.0f,0,0,10f);

    }
    public void playsound9 (View v) {
        pools.play(drum9,1.0f,1.0f,0,0,10f);

    }
}
