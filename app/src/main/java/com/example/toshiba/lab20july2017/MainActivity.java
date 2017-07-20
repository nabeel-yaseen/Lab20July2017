package com.example.toshiba.lab20july2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Contacts> contactses = new ArrayList<>();

        for(int i=0; i<1000; i++){
            contactses.add(new Contacts("Name","Email"));
        }
        ListView listView = (ListView) findViewById(R.id.lv1);
        ArrayAdapter arrayAdapter = new CustomAdapter(this,contactses);
        listView.setAdapter(arrayAdapter);
    }

}
