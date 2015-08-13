package com.example.systems_5.firebasetrydj;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by System S-5 on 11-08-2015.
 */
public class TestApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
