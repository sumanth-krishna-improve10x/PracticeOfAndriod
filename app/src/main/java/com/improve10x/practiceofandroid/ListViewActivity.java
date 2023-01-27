package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityListViewBinding;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
   private ActivityListViewBinding binding;
   private ArrayList<String> names;
   private ArrayAdapter<String> arrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ListView");
        setData();
        handleListView();
    }

    private void handleListView() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,names);
        binding.namesLv.setAdapter(arrayAdapter);
        binding.namesLv.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(this, String.valueOf(names.get(position)), Toast.LENGTH_SHORT).show();
        });
    }

    private void setData() {
        names = new ArrayList<>();
        names.add("Sumanth");
        names.add("Vinod");
        names.add("Hareesh");
        names.add("Sunitha");
        names.add("Vissu");
        names.add("Renuka");
        names.add("Anupama");
        names.add("Pullaiah");
        names.add("Suresh");
        names.add("Sri raghu");
        names.add("Om");
        names.add("Rajesh");
        names.add("Manoj");
        names.add("Roopa");
        names.add("Harsha");
        names.add("Laxmi");
        names.add("charan");
        names.add("Siva");
    }
}