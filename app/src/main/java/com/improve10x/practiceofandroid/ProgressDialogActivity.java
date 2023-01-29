package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;

import com.improve10x.practiceofandroid.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {
    ActivityProgressDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Progress Dialog");
        showProgressDialog();
    }

    private void showProgressDialog() {
        binding.progressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProgressDialog progressDialog = new ProgressDialog(ProgressDialogActivity.this);
                progressDialog.setTitle("This is the Title");
                progressDialog.setMessage("This is the Message");
                progressDialog.show();
            }
        });
    }
}