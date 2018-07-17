package com.example.andrew.rss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.andrew.rss.ITEM_INDEX", -1);
    }

    private int setImg(int index){

        switch (index){
            case 0: return R.layout.activity_main2;
            case 1: return R.layout.sprots_activity;
            default: return -1;

        }
    }

}
