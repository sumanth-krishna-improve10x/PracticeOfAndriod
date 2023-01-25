package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonBtn;
    private Button customToastBtn;
    private Button toggleBtn;
    private Button checkBoxBtn;
    private Button  radioBtn;
    private Button  ratingBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpViews();
        handleButton();
        handleToggleBtn();
        handleCustomBtn();
        handleCheckBoxButton();
        handleRadioBtn();
        handleRatingBar();
    }

    private void handleRatingBar() {
        ratingBar.setOnClickListener(view -> {
            Intent ratingBarIntent = new Intent(this,RatingBarActivity.class);
            startActivity(ratingBarIntent);
        });
    }

    private void handleRadioBtn() {
        radioBtn.setOnClickListener(view -> {
            Intent radioBtnIntent = new Intent(this,RadioButtonActivity.class);
            startActivity(radioBtnIntent);
        });
    }

    private void handleCheckBoxButton() {
        checkBoxBtn.setOnClickListener(view -> {
            Intent checkBoxIntent = new Intent(this,CheckBoxActivity.class);
            startActivity(checkBoxIntent);
        });
    }

    private void handleButton() {
        buttonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddButtonActivity.class);
            startActivity(intent);
        });

    }


    private void handleCustomBtn() {
        customToastBtn.setOnClickListener(view -> {
        Intent customToastIntent = new Intent(this,CustomToastActivity.class);
        startActivity(customToastIntent);
    });
    }

    private void handleToggleBtn() {
        toggleBtn.setOnClickListener(view -> {
            Intent toggleBtnIntent = new Intent(this,ToggleButtonActivity.class);
            startActivity(toggleBtnIntent);
        });
    }

    private void setUpViews() {
        customToastBtn = findViewById(R.id.custom_toast_btn);
        toggleBtn = findViewById(R.id.toggle_btn);
        buttonBtn = findViewById(R.id.button_btn);
        checkBoxBtn = findViewById(R.id.check_box_btn);
        radioBtn = findViewById(R.id.radio_btn);
        ratingBar = findViewById(R.id.rating_bar);

    }
}