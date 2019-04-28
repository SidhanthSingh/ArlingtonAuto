package com.arunika.arlingtonauto.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.arunika.arlingtonauto.R;

public class ParkingSystemActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_list_item);

    }

    public void reserveButton(View view) {

        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),ReservationActivity.class);
        startActivity(intent);
    }
}
