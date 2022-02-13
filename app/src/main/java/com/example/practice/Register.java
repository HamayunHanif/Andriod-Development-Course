package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    Button button;
    TextView textView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button=(Button) findViewById(R.id.btnback);
        textView =(TextView) findViewById(R.id.signin);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRegister();
            }
        });


    }

    public void openRegister(){
        Intent in1 = new Intent(this,MainActivity.class);
        startActivity(in1);
        Intent in2 = new Intent(this,constraint.class);
        startActivity(in2);
    }
}