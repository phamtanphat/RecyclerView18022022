package com.example.recyclerview18022022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.recyclerview18022022.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mBinding;
    FoodAdapter mFoodAdapter;
    List<FoodModel> mListFoods;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        mListFoods = FoodModel.getMocks();
        mFoodAdapter = new FoodAdapter(mListFoods);
        mBinding.recyclerViewFood.setHasFixedSize(true);
        mBinding.recyclerViewFood.setAdapter(mFoodAdapter);


        mFoodAdapter.setOnItemClickFoodHolder(new FoodAdapter.OnItemClickFoodHolder() {
            @Override
            public void onClickFavorite(int position) {
                boolean isFavorite = mListFoods.get(position).isFavorite();
                mListFoods.get(position).setFavorite(!isFavorite);
                mFoodAdapter.notifyItemChanged(position);
            }
        });
    }
}