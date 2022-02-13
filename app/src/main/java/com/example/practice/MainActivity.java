package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Button1 = findViewById(R.id.Button1);
        Button Button2 = findViewById(R.id.regisbtn2);


        Button1.setOnClickListener(this);
        Button2.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Button1:
                Toast.makeText(this,"Welcome to Login System",Toast.LENGTH_LONG).show();
                Intent i1 = new Intent(MainActivity.this,constraint.class);
                startActivity(i1);
                break;
            case R.id.regisbtn2:
                Toast.makeText(this,"Welcome to Registration System",Toast.LENGTH_LONG).show();
                Intent i2 = new Intent(MainActivity.this,Register.class);
                startActivity(i2);
                break;


        }

    }
}