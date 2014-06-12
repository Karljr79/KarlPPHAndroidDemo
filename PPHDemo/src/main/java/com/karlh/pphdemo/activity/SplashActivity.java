package com.karlh.pphdemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;

import com.karlh.pphdemo.R;

/**
 * This class displays the splash screen of the application.
 */
public class SplashActivity extends Activity {

    private int SPLASH_DISPLAY_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

		/*
         * Fades out the splash screen and fades in the next screen after the
		 * specified interval.
		 */
        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent intent = new Intent();
                intent.setClass(SplashActivity.this, LoginScreenActivity.class);

                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();

                overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);


            }
        }, SPLASH_DISPLAY_TIME);

    }

    /**
     * This method is needed to make sure nothing is invoked/called when the
     * orientation of the phone is changed.
     */
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}

