package com.bingin.databindingtest;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.bingin.databindingtest.databinding.LayoutMainBinding;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        LayoutMainBinding binding = DataBindingUtil.setContentView(this, R.layout.layout_main);
        binding.setStu(new Student("test1", "测试位置1"));
        binding.setStr("str");
        binding.setNum(8);
        binding.setError(true);
        binding.setArray(new String[]{"array0", "array1", "array2", "array3"});
        binding.setArraykey(2);
        ArrayList<String> list = new ArrayList<>();
        list.add("list0");
        list.add("list1");
        list.add("list2");
        binding.setList(list);
        binding.setListkey(1);

        HashMap<String, String> map = new HashMap<>();
        map.put("sex", "mapsex");
        map.put("name", "mapname");
        map.put("age", "mapage");
        binding.setMap(map);

    }
}
