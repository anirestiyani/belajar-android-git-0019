package com.project_n.splashscreen;

import android.app.Application;
import android.arch.persistence.room.Room;

import com.project_n.splashscreen.room.AppDataBase;

/**
 * Created by Lenovo on 18/10/2018.
 */

public class AppApplication extends Application {

    public static AppDataBase db;

    @Override
    public void onCreate() {
        super.onCreate();
        db = Room.databaseBuilder(getApplicationContext(),
                AppDataBase.class,"mahasiswa").allowMainThreadQueries().build();
    }

}
