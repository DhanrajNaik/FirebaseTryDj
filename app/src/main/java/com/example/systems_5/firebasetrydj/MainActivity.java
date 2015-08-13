package com.example.systems_5.firebasetrydj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Firebase Ref = new Firebase("https://dhanafirebasetry.firebaseio.com/testing");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Firebase djRef = Ref.child("users").child("parents").child("parent1");
       // Firebase newRef =djRef.child("child_details").push();

        Map<String, Object> mMap = new HashMap<String, Object>();
        mMap.put("name", "dhana");
        mMap.put("class", "be comp");
        mMap.put("school", "rit");

     //   Map<String, Map<String, String>> users = new HashMap<String, Map<String, String>>();
     //   users.put("details", mMap);

     //  djRef.setValue(users);
        djRef.updateChildren(mMap);
    }


}
