package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.practiceofandroid.databinding.ActivityToggleButtonBinding;

public class ToggleButtonActivity extends AppCompatActivity {

    private ActivityToggleButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToggleButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Toggle Button");
        handleBtn();
    }

    // UseInterface

    private void handleBtn() {
        binding.submitBtn.setOnClickListener(view -> {
            String toggle1 = binding.toggleBtn1.getText().toString();
            String toggle2 = binding.toggleBtn2.getText().toString();
            String result = getData(toggle1 , toggle2);
            Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }

    // BusinessLogic
    private String getData(String toggle1, String toggle2) {
        String button1 = "Button1 : " + toggle1 + "\n";
        String button2 = "Button2 : " + toggle2;
        String result = button1 += button2;
        return result;
    }


}