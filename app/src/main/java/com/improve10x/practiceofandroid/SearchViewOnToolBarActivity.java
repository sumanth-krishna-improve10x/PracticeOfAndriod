package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivitySearchViewOnToolBarBinding;

import java.util.ArrayList;

public class SearchViewOnToolBarActivity extends AppCompatActivity {
    private ActivitySearchViewOnToolBarBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewOnToolBarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("SearchView on ToolBar");
        setData();
        handleToolBar();
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("WaterMelon");
        list.add("Papaya");
        list.add("Muskmelon");
        list.add("Leech");
        list.add("Strawberry");
        list.add("Orange");
        list.add("Guava");
        list.add("Peech");
    }

    private void handleToolBar() {
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        binding.listViewLv.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_tool,menu);
        MenuItem searchViewItem = menu.findItem(R.id.app_bar_search);
        final SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchViewItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                searchView.clearFocus();
                if(list.contains(query)){
                    arrayAdapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewOnToolBarActivity.this, "No Match Found", Toast.LENGTH_SHORT).show();
                }
                    return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                arrayAdapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }
}