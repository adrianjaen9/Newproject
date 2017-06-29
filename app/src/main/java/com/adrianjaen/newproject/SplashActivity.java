package com.adrianjaen.newproject;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        sp = getSharedPreferences("APP", Context.MODE_PRIVATE);
        boolean b = sp.getBoolean("isfirstTime", true);

        Intent i;
        //si es su primera vez vamos a ir a la segunda Activity

        if (b) {
            i = new Intent(this, Main2Activity.class);
            SharedPreferences.Editor editor = sp.edit();
            editor.putBoolean("isfirstTime", false);
            editor.apply();
        } else {
            i = new Intent(this, MainActivity.class);
        }
        startActivity(i);
    }
}
