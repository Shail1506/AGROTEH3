package com.rsrfarming.agroteh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity
{
    private Handler mHandler;
    private Runnable mRunnable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        mRunnable=new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),SigninActivity.class));
                finish();
            }
        };
        mHandler =new Handler();
        mHandler.postDelayed( mRunnable,4000);

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if(mHandler != null && mRunnable !=null)
            mHandler.removeCallbacks(mRunnable);
    }
}




