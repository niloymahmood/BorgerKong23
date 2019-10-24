package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodPageActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView foodNameTextView;
    private TextView foodPriceTextView;
    private TextView foodDescTextView;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_page);



        Intent intent = getIntent();
        int foodId =intent.getIntExtra("foodId", 0);
        Food food = FoodDatabase.getFoodById(foodId);

        imageView = findViewById(R.id.foodImageView);
        foodNameTextView = findViewById(R.id.foodName);
        foodPriceTextView = findViewById(R.id.foodPrice);
        foodDescTextView = findViewById(R.id.foodDesc);



        imageView.setImageResource(food.getImageDrawableId());
        foodNameTextView.setText(food.getFoodnName());
        foodDescTextView.setText(food.getDesc());
        foodPriceTextView.setText((String.format("Price: $%.2f", food.getPrice())));


    }


}
