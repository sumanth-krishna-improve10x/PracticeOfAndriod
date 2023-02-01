package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {
    private ActivityTextWatcherBinding binding;
    private ArrayList<String> arrayList;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Text Watcher");
        setData();
        handleTextWatcher();
    }

    private void setData() {
       arrayList = new ArrayList<>();
       arrayList.add("Apple");
       arrayList.add("Banana");
       arrayList.add("Pineapple");
       arrayList.add("Orange");
       arrayList.add("Papaya");
       arrayList.add("Nandyala");
       arrayList.add("Kurnool");
       arrayList.add("Kadapa");
       arrayList.add("Hyderabad");
       arrayList.add("Manglore");
    }

    private void handleTextWatcher() {
        arrayAdapter = new ArrayAdapter(this,R.layout.time_watcher_item,R.id.product_txt,arrayList);
        binding.listViewLv.setAdapter(arrayAdapter);
        binding.editTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                arrayAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(TextWatcherActivity.this, "before text changed", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(TextWatcherActivity.this, "After text changed", Toast.LENGTH_SHORT).show();

            }
        });
    }
}