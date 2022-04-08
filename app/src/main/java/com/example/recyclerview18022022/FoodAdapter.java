package com.example.recyclerview18022022;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview18022022.databinding.ItemFoodBinding;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    List<FoodModel> listFood;

    public FoodAdapter(List<FoodModel> listFood) {
        this.listFood = listFood;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Chuyển đổi từ kiểu int sang kiểu view
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemFoodBinding itemFoodBinding = ItemFoodBinding.inflate(layoutInflater, parent, false);
        return new FoodViewHolder(itemFoodBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return listFood != null && listFood.size() > 0 ? listFood.size() : 0;
    }

    class FoodViewHolder extends RecyclerView.ViewHolder {
        ItemFoodBinding viewBinding;

        public FoodViewHolder(@NonNull ItemFoodBinding itemFoodBinding) {
            super(itemFoodBinding.getRoot());
            viewBinding = itemFoodBinding;
        }
    }
}
