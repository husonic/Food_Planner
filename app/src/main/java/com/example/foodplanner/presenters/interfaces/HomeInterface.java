package com.example.foodplanner.presenters.interfaces;

import com.example.foodplanner.pojo.CategoriesList;
import com.example.foodplanner.pojo.Meals;
import com.example.foodplanner.pojo.MealsList;

import java.util.ArrayList;
import java.util.List;

public interface HomeInterface {
     void showRandomMeals(List<MealsList> mealsArrayList);
     void showCats(CategoriesList categoriesList);

}