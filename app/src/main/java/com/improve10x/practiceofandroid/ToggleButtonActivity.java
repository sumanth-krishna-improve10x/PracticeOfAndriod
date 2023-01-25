package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButtonActivity extends AppCompatActivity {
    private ToggleButton toggleBtn1;
    private ToggleButton toggleBtn2;
    private Button       submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toggle_button);
        getSupportActionBar().setTitle("Toggle Button");
        setUpViews();
        handleBtn();
    }

    private void handleBtn() {
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("toggleBtn1 :").append(toggleBtn1.getText());
                result.append("toggleBtn2: ").append(toggleBtn2.getText());
                Toast.makeText(ToggleButtonActivity.this, result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }

    private void setUpViews() {
        toggleBtn1 = findViewById(R.id.toggle_btn1);
        toggleBtn2 = findViewById(R.id.toggle_btn2);
        submitBtn = findViewById(R.id.submit_btn);
    }
}