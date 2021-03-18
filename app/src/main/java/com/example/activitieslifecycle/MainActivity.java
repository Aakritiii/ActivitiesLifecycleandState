package com.example.activitieslifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.twoactivities.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}