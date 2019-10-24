package com.example.borgerkong;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.FoodViewHolder> {
private ArrayList<Food> foodItemsToAdapt;

public void setData(ArrayList<Food> foodItemsToAdapt){
    this.foodItemsToAdapt = foodItemsToAdapt;
}


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food, parent, false);

        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
    final Food foodAtPosition = foodItemsToAdapt.get(position);

    holder.foodNameTextView.setText(foodAtPosition.getFoodnName());

        holder.view.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Context context = view.getContext();

            Intent intent = new Intent(context, FoodPageActivity.class);
            intent.putExtra("foodId", foodAtPosition.getFoodId());
            context.startActivity(intent);
        }
    });


        holder.foodItemImageView.setImageResource(foodAtPosition.getImageDrawableId());






    }

    @Override
    public int getItemCount() {
        return foodItemsToAdapt.size();
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView foodItemImageView;
        public TextView foodNameTextView;


        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            foodNameTextView = itemView.findViewById(R.id.foodName);
            foodItemImageView = itemView.findViewById(R.id.foodImageView);
        }
    }

}
