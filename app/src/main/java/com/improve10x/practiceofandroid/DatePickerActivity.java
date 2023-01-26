package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

public class DatePickerActivity extends AppCompatActivity {
    private DatePicker   datePicker;
    private TextView     currentDateTxt;
    private Button       changeDateBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        getSupportActionBar().setTitle("Date Picker");
        setUpViews();
        handleBtn();
    }

    private void handleBtn() {
        changeDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentDateTxt.setText("Current Date: "+ getCurrentDate());
                currentDateTxt.setText("Change Date: "+ getCurrentDate());
            }

            private String getCurrentDate() {
                StringBuilder builder = new StringBuilder();
                builder.append((datePicker.getMonth() + 1)+"/");
                builder.append((datePicker.getDayOfMonth() ) +"/");
                builder.append(datePicker.getYear());
                return builder.toString();
            }
        });
    }

    private void setUpViews() {
        datePicker = findViewById(R.id.date_picker);
        currentDateTxt = findViewById(R.id.current_date_txt);
        changeDateBtn = findViewById(R.id.change_date_btn);
    }
}