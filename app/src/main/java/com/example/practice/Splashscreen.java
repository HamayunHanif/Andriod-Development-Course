package com.example.practice;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5);
                    Intent in2 = new Intent(Splashscreen.this,MainActivity.class);
                    startActivity(in2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
    }
}