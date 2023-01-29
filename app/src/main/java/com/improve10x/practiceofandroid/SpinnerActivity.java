package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    private ActivitySpinnerBinding binding;
    private ArrayList<String> district;
    private Spinner districtSp;
    private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Spinner");
        setData();
        spinnerForDistrictsNames();
    }


    private void spinnerForDistrictsNames() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,district);
        binding.districtSp.setAdapter(arrayAdapter);
        binding.districtSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(SpinnerActivity.this, district.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    private void setData() {
        district = new ArrayList<>();
        district.add("Nandyala");
        district.add("Kurnool");
        district.add("Kadapa");
        district.add("Ananatapur");
        district.add("Chittor");
        district.add("Onogle");
        district.add("Krishna");
        district.add("Vizag");
        district.add("SriKakulam");
    }
}