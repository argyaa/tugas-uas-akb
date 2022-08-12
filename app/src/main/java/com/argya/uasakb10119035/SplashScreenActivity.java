/*
 *   NIM : 10119035
 *   NAMA : ARGYA AULIA FAUZANDIKA
 *   KELAS : IF-1
 * */

package com.argya.uasakb10119035;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.argya.uasakb10119035.ui.auth.RegisterActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), RegisterActivity.class));
                finish();
            }
        }, 3000);
    }
}