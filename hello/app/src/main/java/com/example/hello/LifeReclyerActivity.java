package com.example.hello;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LifeReclyerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_recycler);
        Log.d("LifeRecycler","---onCreate---");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeRecycler","---onStart---");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeRecycler","---onResume---");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeRecycler","---onPause---");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeRecycler","---onStop---");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeRecycler","---onRestart---");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeRecycler","---onDestroy---");
    }
}
