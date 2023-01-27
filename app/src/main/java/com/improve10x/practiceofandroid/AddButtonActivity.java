package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityAddButtonBinding;

public class AddButtonActivity extends AppCompatActivity {
    ActivityAddButtonBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sum of two numbers");
        handleBtn();
    }
    // User Interface
    private void handleBtn(){
        binding.sumBtn.setOnClickListener(view -> {
             String number1 = binding.firstNumberTxt.getText().toString();
             String number2 = binding.secondNumberTxt.getText().toString();
             String sum = add(number1,number2);
            Toast.makeText(this, sum, Toast.LENGTH_SHORT).show();
        });
    }

    // Business Logic
    private String add(String number1, String number2){
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int sum = num1 + num2;
        return String.valueOf(sum);
    }
}