package com.example.mamohamed.pianoapp;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool mSoundPool;
    private int mAsoundId;
    private int mBsoundId;
    private int mCsoundId;
    private int mDsoundId;
    private int mEsoundId;
    private int mFsoundId;
    private int mGsoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC,0);


        mCsoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDsoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mEsoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFsoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGsoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mAsoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBsoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);


    }
    public void playA(View v){

        mSoundPool.play(mAsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playB(View v){

        mSoundPool.play(mBsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playC(View v){
        mSoundPool.play(mCsoundId,1.0f,1.0f,0,0,1.0f);
    }
    public void playD(View v){

        mSoundPool.play(mDsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playE(View v){

        mSoundPool.play(mEsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playF(View v){

        mSoundPool.play(mFsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public void playG(View v){
        mSoundPool.play(mGsoundId,1.0f,1.0f,0,0,1.0f);
    }
}

