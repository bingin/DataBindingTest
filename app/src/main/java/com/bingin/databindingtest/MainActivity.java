package com.bingin.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bingin.databindingtest.databinding.LayoutMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LayoutMainBinding binding = DataBindingUtil.setContentView(this, R.layout.layout_main);
        binding.setStu(new Student("test1", "测试位置1"));

    }
}
