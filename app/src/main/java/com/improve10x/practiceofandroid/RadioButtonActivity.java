package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioButtonActivity extends AppCompatActivity {
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private Button showBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);
        getSupportActionBar().setTitle("Radio Button");
        setUpViews();
        handleBtn();
    }

    private void handleBtn() {
        showBtn.setOnClickListener(view -> {
            if(radioButton1.isChecked()){
                Toast.makeText(this, "Male", Toast.LENGTH_LONG).show();
            }

            if (radioButton2.isChecked()){
                Toast.makeText(this, "Female", Toast.LENGTH_LONG).show();
            }

        });
    }

    private void setUpViews() {
        radioButton1 = findViewById(R.id.radio_button1);
        radioButton2 = findViewById(R.id.radio_button2);
        showBtn = findViewById(R.id.show_btn);
    }
}