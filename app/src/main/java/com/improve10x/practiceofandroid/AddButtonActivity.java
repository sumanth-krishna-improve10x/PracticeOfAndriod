package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddButtonActivity extends AppCompatActivity {
    private EditText firstNumberTxt;
    private EditText secondNumberTxt;
    private Button sumBtn;
    private Button customToastBtn;
    private Button toggleBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_button);
        getSupportActionBar().setTitle("Sum of two numbers");
        setupViews();
        handleBtn();
        handleCustomBtn();
        handleToggleBtn();

    }

    private void handleToggleBtn() {
        toggleBtn.setOnClickListener(view -> {
            Intent toggleBtnIntent = new Intent(this,ToggleButtonActivity.class);
            startActivity(toggleBtnIntent);
        });
    }

    private void handleCustomBtn() {
        customToastBtn.setOnClickListener(view -> {
            Intent customToastIntent = new Intent(this,CustomToastActivity.class);
            startActivity(customToastIntent);
        });
    }


    private void setupViews() {
        firstNumberTxt = findViewById(R.id.first_number_txt);
        secondNumberTxt = findViewById(R.id.second_number_txt);
        sumBtn = findViewById(R.id.sum_btn);
        customToastBtn = findViewById(R.id.custom_toast_btn);
        toggleBtn = findViewById(R.id.toggle_btn);
    }

    private void handleBtn() {
        sumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String firstNumber = firstNumberTxt.getText().toString();
               String secondNumber = secondNumberTxt.getText().toString();
                int a = Integer.parseInt(firstNumber);
                int b = Integer.parseInt(secondNumber);
                int sum = a + b;
                Toast.makeText(AddButtonActivity.this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
                //Toast.makeText(AddButton.this, "Hello Improve10X", Toast.LENGTH_SHORT).show();
            }
        });
    }
}