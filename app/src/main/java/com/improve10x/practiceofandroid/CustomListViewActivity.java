package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.improve10x.practiceofandroid.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;
import java.util.List;

public class CustomListViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        getSupportActionBar().setTitle("CustomListView");
    }

    //ListView customLv = findViewById(R.id.custom_lv);
   // List<String> items = new ArrayList<>();
       // items.add("Item 1");
        //items.add("Item 2");
        //items.add("Item 3");

    //CustomAdapter adapter = new CustomAdapter(this, items);
      // customLv.setAdapter(adapter);
}

//}