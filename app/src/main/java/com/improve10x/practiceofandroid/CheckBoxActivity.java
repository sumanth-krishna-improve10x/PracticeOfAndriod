package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {
    private CheckBox pizzaItem;
    private CheckBox coffeeItem;
    private CheckBox burgerItem;
    private Button   orderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        getSupportActionBar().setTitle("Check Box");
        setUpViews();
        handleBtn();
    }

    private void handleBtn() {
        orderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int totalamount = 0;
                StringBuilder result = new StringBuilder();
                result.append("Selected items: ");

                if(pizzaItem.isChecked()){
                    result.append("\t Pizza 300Rs");
                    totalamount += 300;
                }
                if(coffeeItem.isChecked()){
                    result.append("\tCoffee 100rs");
                    totalamount += 100;
                }
                if(burgerItem.isChecked()){
                    result.append("\tBurger 150");
                    totalamount += 150;

                    result.append("\tTotal:" + totalamount + "rs");
                    Toast.makeText(CheckBoxActivity.this, result.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void setUpViews() {
        pizzaItem = findViewById(R.id.pizza_item);
        coffeeItem = findViewById(R.id.coffee_item);
        burgerItem = findViewById(R.id.burger_item);
        orderBtn   =  findViewById(R.id.order_btn);
    }
}