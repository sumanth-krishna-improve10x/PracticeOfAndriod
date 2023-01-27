package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.improve10x.practiceofandroid.databinding.ActivityCheckBoxBinding;

public class CheckBoxActivity extends AppCompatActivity {
    private ActivityCheckBoxBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckBoxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Check Box");
        handleBtn();
    }

    // Use Interface
    private void handleBtn() {
        binding.orderBtn.setOnClickListener(view -> {
            boolean isPizzaSelected = binding.pizzaCb.isChecked();
            boolean isCoffeeSelected = binding.coffeeCb.isChecked();
            boolean isBurgerSelected = binding.burgerCb.isChecked();
            String orderDetails = createOrderDetails(isPizzaSelected, isCoffeeSelected, isBurgerSelected);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    // Business Logic
    private String createOrderDetails(boolean isPizzaSelected, boolean isCoffeeSelected, boolean isBurgerSelected) {
        int totalAmount = 0;
        String orderDetails = "Selected Items";
        if (isPizzaSelected) {
            totalAmount += 100;
            orderDetails += "\tPizza: Rs100";
        }
            if (isCoffeeSelected) {
                totalAmount += 50;
                orderDetails += "\tCoffee: Rs50";
            }
                if (isBurgerSelected) {
                    totalAmount += 120;
                    orderDetails += "\tBurger: Rs120";
                }
        orderDetails += "Total: Rs" + totalAmount;
        return orderDetails;
    }
}