package com.arunika.arlingtonauto.controller;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.arunika.arlingtonauto.R;

public class NoShowActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.no_show_violations);
    }
}