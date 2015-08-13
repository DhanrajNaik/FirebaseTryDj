package com.example.systems_5.firebasetrydj;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.firebase.client.Firebase;

/**
 * Created by System S-5 on 11-08-2015.
 */
public class Retrive extends ActionBarActivity {
    Firebase Ref = new Firebase("https://dhanafirebasetry.firebaseio.com/testing");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
