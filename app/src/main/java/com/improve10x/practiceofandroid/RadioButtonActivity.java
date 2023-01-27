package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityRadioButtonBinding;

public class RadioButtonActivity extends AppCompatActivity {
    private  ActivityRadioButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityRadioButtonBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Radio Button");
        handleSelectedBtn();
    }

    private void handleSelectedBtn() {
        binding.showBtn.setOnClickListener(view -> {
            boolean male = binding.radioButton1.isChecked();
            boolean female = binding.radioButton2.isChecked();
            String result = selectedGender(male , female);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });

    }

    private String selectedGender(boolean male, boolean female) {
        String result = "Selected Option : ";
        if(male){
            result += "Male";
        }
        if(female){
            result += "Female";
        }
        return result;
    }
}