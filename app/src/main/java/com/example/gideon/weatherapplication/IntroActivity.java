package com.example.gideon.weatherapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    private ViewPager screenpager;
    IntroViewPagerAdapter introViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        //fill list screen

        List<ScreenItem> mlist = new ArrayList<>();
        mlist.add(new ScreenItem("Todays weather","The Weather Application Service is your best source for complete weather forecast",R.drawable.image1));
        mlist.add(new ScreenItem("Weather Outcome","Issue to highlight significant weather that are favourable.",R.drawable.image2));
        mlist.add(new ScreenItem("User Friendly","Easy to use",R.drawable.image3));


        //setup viewpager
        screenpager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mlist);
        screenpager.setAdapter(introViewPagerAdapter);

    }
}
