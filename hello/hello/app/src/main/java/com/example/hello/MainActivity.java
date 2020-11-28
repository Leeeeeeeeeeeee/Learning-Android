package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnEditText;
    private Button mBtnRadioButton;
    private Button mBtnCheckBox;
    private Button mBtnImageBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView演示页面
                Intent intent =  new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });
        mBtnButton = findViewById(R.id.btn_button);
        mBtnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //跳转到Button演示页面
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnEditText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                //跳转到EditText演示页面
                Intent intent =  new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });
        mBtnRadioButton = findViewById(R.id.btn_radiobuttn);*/
        mBtnTextView = (Button)findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnEditText = findViewById(R.id.btn_edittext);
        mBtnRadioButton = findViewById(R.id.btn_radiobutton);
        mBtnCheckBox = findViewById(R.id.btn_checkbox);
        mBtnImageBox = findViewById(R.id.btn_imageview);
        setListeners();
    }

    private void setListeners(){
        OnClick onClick = new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mBtnButton.setOnClickListener(onClick);
        mBtnEditText.setOnClickListener(onClick);
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnCheckBox.setOnClickListener(onClick);
        mBtnImageBox.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v){
            Intent intent = null;
            switch (v.getId()){
                case R.id.btn_textview:
                    //跳转到TextView演示页面
                    intent =  new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    //跳转到Button演示页面
                    intent = new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edittext:
                    //跳转到EditText演示页面
                    intent =  new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    //跳转到RadioButton演示页面
                    intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    //跳转到CheckBox演示页面
                    intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    //跳转到ImageView演示页面
                    intent = new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}