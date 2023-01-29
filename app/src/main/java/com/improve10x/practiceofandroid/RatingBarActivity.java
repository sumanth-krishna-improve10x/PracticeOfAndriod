package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityRatingBarBinding;

public class RatingBarActivity extends AppCompatActivity {
    private ActivityRatingBarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityRatingBarBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Rating Bar");
        handleRatingBar();
    }

    private void handleRatingBar() {
        binding.submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(binding.ratingBarBtn.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        });
    }
}