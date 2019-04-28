package com.arunika.arlingtonauto.controller;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.arunika.arlingtonauto.R;

public class NewReservation extends Activity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_rental_search_results);
        ListView listView = (ListView) findViewById(R.id.requestList);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(),ParkingSystemActivity.class);
                startActivity(intent);
            }
        });


    }

}

