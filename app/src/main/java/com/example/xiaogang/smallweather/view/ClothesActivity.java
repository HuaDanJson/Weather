package com.example.xiaogang.smallweather.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.xiaogang.smallweather.R;
import com.example.xiaogang.smallweather.constants.AppConstant;
import com.example.xiaogang.smallweather.util.SharedPrefUtils;

public class ClothesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);
        Log.i("aaa","temper "+ SharedPrefUtils.getInstance().getString(AppConstant.SharedPreferenceKey.NOW_WEATHER));
    }
}
