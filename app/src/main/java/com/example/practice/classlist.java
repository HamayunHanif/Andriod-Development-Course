package com.example.practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class classlist extends AppCompatActivity {
    ListView clv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classlist);
        clv = findViewById(R.id.clv);
        String[] data={"Hamayun","Huzaifa","Zuhaib","Moeed","Ahmad","Avista"};
        Integer[] imgid={R.drawable.jh,R.drawable.huzi,R.drawable.zuhaib,R.drawable.moeed,R.drawable.ahmad,R.drawable.pista};

        customeradapter customeradapter = new customeradapter(getApplicationContext(),data,imgid);
        clv.setAdapter(customeradapter);



    }
     class customeradapter extends ArrayAdapter<String> {
        private final Context context;
        private final String [] data;
        private final Integer[] imgid;

         customeradapter(@NonNull Context context, String [] data,Integer[] imgid) {
            super(context, R.layout.customlist,data);

            this.context=context;
            this.data=data;
            this.imgid=imgid;
        }
        public View getView(int i, View convertview,ViewGroup viewGroup ) {
            View v1 = getLayoutInflater().inflate(R.layout.customlist, viewGroup, true);
            ImageView img =v1.findViewById(R.id.img);
            TextView name =v1.findViewById(R.id.name);

            img.setImageResource(imgid[i]);
            name.setText(data[i]);

            return v1;





        }
    }
}