package com.example.andrew.rss;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    String[] items;
    String[] descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        myListView = findViewById(R.id.myListView);
        items = res.getStringArray(R.array.items);
        descriptions = res.getStringArray(R.array.descriptions);

        ItemAdapter itemAdapter = new ItemAdapter(this, items, descriptions);
        myListView.setAdapter(itemAdapter);


        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent showDetailActivity = new Intent(getApplicationContext(),Main2Activity.class);
                showDetailActivity.putExtra("com.example.andrew.rss.ITEM_INDEX", i);
                startActivity(showDetailActivity);
            }
        });

    }
}
