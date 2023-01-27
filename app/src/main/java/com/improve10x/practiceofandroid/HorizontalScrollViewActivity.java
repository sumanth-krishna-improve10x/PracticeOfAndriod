package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class HorizontalScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizontal_scroll_view);
        getSupportActionBar().setTitle("HorizontalScrollView");
    }
}