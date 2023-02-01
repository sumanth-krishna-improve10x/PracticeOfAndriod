package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivitySerachViewBinding;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {
    private ActivitySerachViewBinding binding;
    private ArrayList<String> fruits;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySerachViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("SearchView");
        setData();
        handleSearchView();
    }


    private void handleSearchView() {
            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,fruits);
            binding.listviewLv.setAdapter(arrayAdapter);

      binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
           @Override
           public boolean onQueryTextSubmit(String query) {
               if(fruits.contains(query)) {
                   arrayAdapter.getFilter().filter(query);
               }else {
                   Toast.makeText(SearchViewActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();

               }
               return false;
           }

           @Override
           public boolean onQueryTextChange(String fruitsText) {
               return false;
           }
       });
    }

    private void setData() {
        fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.add("Guava");
        fruits.add("WaterMelon");
        fruits.add("Mangoes");
        fruits.add("Pine apple");
        fruits.add("Custard Apple");
    }
}