package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listview extends AppCompatActivity {

    ListView listView;
    String[] Countries = {"Pakistan","India","Portugal","Iran","Iraq","Turkey","France","Sweeden"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        listView = findViewById(R.id.listc);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(listview.this, android.R.layout.simple_expandable_list_item_1 , Countries);
        listView.setAdapter(adp);
    }
}