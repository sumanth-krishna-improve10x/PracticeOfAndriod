package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityCustomToastBinding;

public class CustomToastActivity extends AppCompatActivity {
    private ActivityCustomToastBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomToastBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomToast");
        handleBtn();

    }

    private void handleBtn() {
        binding.customToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }

            private void showToast() {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_root));

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);

                toast.show();
            }
        });
    }
}

