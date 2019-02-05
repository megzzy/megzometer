package com.example.magdymetre;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<String> platforms = new ArrayList<>();
        platforms.add("Android");
        platforms.add("iPhone");
        platforms.add("Windows");
        platforms.add("Blackberry");
        platforms.add("Linux");
        ArrayAdapter<String> adapterr = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, platforms);
        ListView list = findViewById(R.id.list);
        list.setAdapter(adapterr);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               if (position ==0){
                    Intent intent0 = new Intent(getApplicationContext(), Android.class);
                    startActivity(intent0);
                }
                if (position ==1){
                    Intent intent1 = new Intent(getApplicationContext(), iPhone.class);
                    startActivity(intent1);
                }
                if (position ==2){
                    Intent intent2 = new Intent(getApplicationContext(), Windows.class);
                    startActivity(intent2);
                }
                if (position ==3){
                    Intent intent3 = new Intent(getApplicationContext(), Blackberry.class);
                    startActivity(intent3);
                }
                if (position ==4){
                    Intent intent4 = new Intent(getApplicationContext(), Linux.class);
                    startActivity(intent4);
                }



            }
        });


    }
}