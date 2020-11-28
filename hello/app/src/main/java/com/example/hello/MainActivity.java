package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hello.broadcast.BroadActivity;
import com.example.hello.datastorage.DataStorageActivity;
import com.example.hello.fragment.ContainerActivity;
import com.example.hello.jump.AActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnUI;
    private Button mBtnTest;
    private Button mBtnJump;
    private Button mBtnFragment;
    private Button mBtnEvent;
    private Button mBtnDataStorage;
    private Button mBtnBroad;
    private Button mBtnObjectAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},1);

        mBtnUI = (Button)findViewById(R.id.btn_ui);
        mBtnTest = (Button)findViewById(R.id.btn_life_recycler);
        mBtnJump = (Button)findViewById(R.id.btn_jump);
        mBtnFragment = (Button)findViewById(R.id.btn_fragment);
        mBtnEvent = (Button)findViewById(R.id.btn_event);
        mBtnDataStorage = (Button)findViewById(R.id.btn_datastoraga);
        mBtnBroad = (Button)findViewById(R.id.btn_broad);
        mBtnObjectAnim = (Button)findViewById(R.id.btn_objectanim);

        OnClick onClick = new OnClick();

        mBtnUI.setOnClickListener(onClick);
        mBtnTest.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
        mBtnEvent.setOnClickListener(onClick);
        mBtnDataStorage.setOnClickListener(onClick);
        mBtnBroad.setOnClickListener(onClick);
        mBtnObjectAnim.setOnClickListener(onClick);

    }

    class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_ui:
                    intent = new Intent(MainActivity.this, UIActivity.class);
                    break;
                case R.id.btn_life_recycler:
                    intent = new Intent(MainActivity.this, LifeReclyerActivity.class);
                    break;
                case R.id.btn_jump:
                    intent = new Intent(MainActivity.this, AActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent = new Intent(MainActivity.this, ContainerActivity.class);
                    break;
                case R.id.btn_event:
                    intent = new Intent(MainActivity.this, EventActivity.class);
                    break;
                case R.id.btn_datastoraga:
                    intent = new Intent(MainActivity.this, DataStorageActivity.class);
                    break;
                case R.id.btn_broad:
                    intent = new Intent(MainActivity.this, BroadActivity.class);
                    break;
                case R.id.btn_objectanim:
                    intent = new Intent(MainActivity.this, ObjectAnimationActivity.class);
                    break;
            }
            startActivity(intent);
        }

    }
}