package com.example.liyan.leetcodeproj.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.liyan.leetcodeproj.R;

public class problemActivity extends AppCompatActivity {
    TabLayout mTabLayout;
    ViewPager mViewPager;
    final String[] title= new String[]{"Description", "Discuss", "Solution"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);



    }
}
