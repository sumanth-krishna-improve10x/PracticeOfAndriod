package com.improve10x.practiceofandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.improve10x.practiceofandroid.databinding.CustomListViewItemBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomListViewAdapter extends ArrayAdapter<CustomList> {
    CustomListViewItemBinding binding;

    public CustomListViewAdapter(@NonNull Context context, int resource, ArrayList<CustomList> textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        binding = CustomListViewItemBinding.inflate(LayoutInflater.from(getContext()),parent,false);
        CustomList customList = getItem(position);
        Picasso.get().load(customList.imageUrl).into(binding.imageImg);
        binding.titleTxt.setText(customList.title);
        binding.subTitleTxt.setText(customList.subTitle);
        return binding.getRoot();
    }
}
