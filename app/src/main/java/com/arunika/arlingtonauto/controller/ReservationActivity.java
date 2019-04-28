package com.arunika.arlingtonauto.controller;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.arunika.arlingtonauto.R;

public class ReservationActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_rental);

    }

    public void onConfirm(View view) {
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),SummaryRentalActivity.class);
        startActivity(intent);
    }
}
