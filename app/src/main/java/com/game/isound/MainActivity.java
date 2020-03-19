package com.game.isound;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
    private static final String TAG = "MainActivity";
    private int MAX_STREAM = 7;
    private int sound1,sound2,sound3,sound4,sound5,sound6,sound7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundPool = new SoundPool(MAX_STREAM, AudioManager.STREAM_MUSIC,0);
        sound1 = soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        sound2 = soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        sound3 = soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        sound4 = soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        sound5 = soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        sound6 = soundPool.load(getApplicationContext(),R.raw.note6_a,1);
        sound7 = soundPool.load(getApplicationContext(),R.raw.note7_b,1);
    }

// this way of coding event has advantage of not charging the code but in case if you want mix sound int the same time
    //it won't work!! so you should code each soundButton in its appropriate method
    public void onClickSound(View view) {

            switch (view.getId()){
                case R.id.button1 : {soundPool.play(sound1,1,1,1,0,1);
                    Log.d(TAG, "onClickSound: 1");break;}
                case R.id.button2 : {soundPool.play(sound2,1,1,1,0,1);break;}
                case R.id.button3 : {soundPool.play(sound3,1,1,1,0,1);break;}
                case R.id.button4 : {soundPool.play(sound4,1,1,1,0,1);break;}
                case R.id.button5 : {soundPool.play(sound5,1,1,1,0,1);break;}
                case R.id.button6 : {soundPool.play(sound6,1,1,1,0,1);break;}
                case R.id.button7 : {soundPool.play(sound7,1,1,1,0,1);break;}
            }


    }
}
