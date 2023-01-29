package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceofandroid.databinding.ActivityCustomListViewBinding;

public class CustomListViewActivity extends AppCompatActivity {
    ActivityCustomListViewBinding binding;
    String appsList[] = {"Whatsapp","Facebook","Instagram", "Twitter", "Youtube"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomListView");
    }
}