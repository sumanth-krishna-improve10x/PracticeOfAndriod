package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.improve10x.practiceofandroid.databinding.ActivityAlertDialogBinding;
import com.improve10x.practiceofandroid.databinding.ActivityCustomAlertDialogBinding;
import com.improve10x.practiceofandroid.databinding.CustomAlertDialogItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {
    private ActivityCustomAlertDialogBinding binding;
    private Dialog dialog;
    private CustomAlertDialogItemBinding customAlertDialogItemBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomAlertDialog");
        handleBtn();
    }

    private void handleBtn() {
        binding.customAlertDialogClick.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customAlertDialogItemBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertDialogItemBinding.getRoot());
            customAlertDialogItemBinding.okBtn.setOnClickListener(view1 -> {
                finish();
            });
            customAlertDialogItemBinding.imageBtn.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customAlertDialogItemBinding.alertTxt.setText("ALERT!!!!!!!");
            dialog.show();
        });
    }
}