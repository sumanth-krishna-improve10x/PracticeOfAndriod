package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.practiceofandroid.databinding.ActivityCustomListViewBinding;

import java.util.ArrayList;

public class CustomListViewActivity extends AppCompatActivity {
     private ActivityCustomListViewBinding binding;
    private ArrayList<CustomList> listsLv;
    private CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomListViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("CustomListView");
        setData();
        customListView();
    }

    private void setData() {
        listsLv = new ArrayList<>();
        CustomList title = new CustomList();
        title.imageUrl = "https://cdn4.iconfinder.com/data/icons/iconsimple-logotypes/512/github-96.png";
        title.title = "Git Hub";
        title.subTitle = "Java";
        listsLv.add(title);
    }

    private void customListView() {
        customListViewAdapter = new CustomListViewAdapter(this,R.layout.custom_list_view_item, listsLv);
        binding.customLv.setAdapter(customListViewAdapter);
    }

}
