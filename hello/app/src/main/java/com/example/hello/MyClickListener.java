package com.example.hello;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import com.example.hello.util.ToastUtil;

public class MyClickListener implements View.OnClickListener {

    private Activity mActivity;

    public MyClickListener(Activity activity){
        this.mActivity=activity;
    }
    @Override
    public void onClick(View v) {
        Log.d("外部类","click");
        ToastUtil.showMsg(mActivity,"click...");
    }
}
