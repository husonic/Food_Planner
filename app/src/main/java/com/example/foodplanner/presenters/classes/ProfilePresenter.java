package com.example.foodplanner.presenters.classes;

import android.content.Context;

import com.example.foodplanner.database.SharedPrefrencesClass;
import com.example.foodplanner.repository.Repository;
import com.example.foodplanner.utils.FavCompresser;

public class ProfilePresenter {
    Context context;
    FavCompresser compresser;
    public ProfilePresenter(Context context){
        this.context=context;
    }
    public void saveFav(){
        compresser=new FavCompresser(context);
        compresser.favBackup();
        compresser.planBackup();

    }
    public void clearData(){
        Repository.getInstance(context).clearRoom();
        SharedPrefrencesClass.setIsLogedIn(false);

    }
}
