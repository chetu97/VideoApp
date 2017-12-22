package com.chaitanya.sanoriya.videoapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity
{
    private ImageView imageView;
    private TextView textView;
    private String getVal;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        imageView = (ImageView) findViewById(R.id.icon);
        textView = (TextView) findViewById(R.id.name);

        final Animation animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);
        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
        imageView.startAnimation(animationFadeIn);
        textView.startAnimation(animationFadeIn);
    }
}
