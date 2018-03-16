package com.example.tanvir.listview;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoadingActivity extends AppCompatActivity {
    private static int LoadingTime=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent LoadingIntent=new Intent(LoadingActivity.this,MainActivity.class);
                startActivity(LoadingIntent);
                finish();
            }
        },LoadingTime);
    }
}
