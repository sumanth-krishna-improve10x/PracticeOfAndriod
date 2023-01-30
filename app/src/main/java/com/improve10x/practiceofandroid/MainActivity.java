package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.practiceofandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        handleButton();
        handleToggleBtn();
        handleCustomBtn();
        handleCheckBoxButton();
        handleRadioBtn();
        handleRatingBar();
        handleSeekBar();
        handleDatePicker();
        handleTimePicker();
        handleVerticalScroll();
        handleHorizontalScroll();
        handleListView();
        handleCustomListView();
        handleAlertDialog();
        handleProgressDialog();
        handleWebView();
        handleSpinner();
        handleCustomAlertDialog();
        handleSearchView();
    }

    private void handleSearchView() {
        binding.searchViewBtn.setOnClickListener(view -> {
            Intent searchViewIntent = new Intent(this,SearchViewActivity.class);
            startActivity(searchViewIntent);
        });
    }

    private void handleCustomAlertDialog() {
        binding.customAlertDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,CustomAlertDialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleSpinner() {
        binding.spinnerBtn.setOnClickListener(view -> {
            Intent spinnerIntent = new Intent(this,SpinnerActivity.class);
            startActivity(spinnerIntent);
        });
    }

    private void handleWebView() {
        binding.webViewBtn.setOnClickListener(view -> {
            Intent webViewIntent = new Intent(this,WebViewActivity.class);
            startActivity(webViewIntent);
        });
    }

    private void handleProgressDialog() {
        binding.progressDialogBtn.setOnClickListener(view -> {
            Intent progressAlertIntent = new Intent(this,ProgressDialogActivity.class);
            startActivity(progressAlertIntent);
        });
    }

    private void handleAlertDialog() {
        binding.alertDialogBtn.setOnClickListener(view -> {
            Intent alertDialogIntent = new Intent(this,AlertDialogActivity.class);
            startActivity(alertDialogIntent);
        });
    }

    private void handleCustomListView() {
        binding.customListViewBtn.setOnClickListener(view -> {
            Intent customListViewIntent = new Intent(this,CustomListViewActivity.class);
            startActivity(customListViewIntent);
        });
    }

    private void handleListView() {
        binding.listViewBtn.setOnClickListener(view -> {
            Intent listViewIntent = new Intent(this,ListViewActivity.class);
            startActivity(listViewIntent);
        });
    }

    private void handleHorizontalScroll() {
        binding.horizontalScroll.setOnClickListener(view -> {
            Intent horizontalIntent = new Intent(this,HorizontalScrollViewActivity.class);
            startActivity(horizontalIntent);
        });
    }

    private void handleVerticalScroll() {
        binding.verticalScrollBtn.setOnClickListener(view -> {
            Intent verticalScrollIntent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(verticalScrollIntent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            Intent timePickerIntent = new Intent(this,TimePickerActivity.class);
            startActivity(timePickerIntent);
        });
    }

    private void handleDatePicker() {
        binding.datePickerBtn.setOnClickListener(view -> {
            Intent datePickerIntent = new Intent(this,DatePickerActivity.class);
            startActivity(datePickerIntent);
        });
    }

    private void handleSeekBar() {
       binding.seekBarBtn.setOnClickListener(view -> {
           Intent seekBarIntent = new Intent(this, SeekBarActivity.class);
           startActivity(seekBarIntent);
       });
    }

    private void handleRatingBar() {
        binding.ratingBar.setOnClickListener(view -> {
            Intent ratingBarIntent = new Intent(this,RatingBarActivity.class);
            startActivity(ratingBarIntent);
        });
    }

    private void handleRadioBtn() {
       binding. radioBtn.setOnClickListener(view -> {
            Intent radioBtnIntent = new Intent(this,RadioButtonActivity.class);
            startActivity(radioBtnIntent);
        });
    }

    private void handleCheckBoxButton() {
        binding.checkBoxBtn.setOnClickListener(view -> {
            Intent checkBoxIntent = new Intent(this,CheckBoxActivity.class);
            startActivity(checkBoxIntent);
        });
    }

    private void handleButton() {
        binding.buttonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomBtn() {
       binding. customToastBtn.setOnClickListener(view -> {
        Intent customToastIntent = new Intent(this,CustomToastActivity.class);
        startActivity(customToastIntent);
    });
    }

    private void handleToggleBtn() {
        binding.toggleBtn.setOnClickListener(view -> {
            Intent toggleBtnIntent = new Intent(this,ToggleButtonActivity.class);
            startActivity(toggleBtnIntent);
        });
    }

}