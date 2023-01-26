package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.improve10x.practiceofandroid.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {
   ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Time Picker");
        handleButton();

    }

    private void handleButton() {
        binding.changeTimeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.currentTimeTxt.setText(getCurrentTime());
            }

            private String getCurrentTime() {
                String currentTime = "Current Time : "+ binding.timePicker.getCurrentHour() + ":" + binding.timePicker.getCurrentMinute();
                return currentTime;
            }
        });
    }

}