package com.example.fragment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=findViewById(R.id.tablayout_id);
        viewPager= findViewById(R.id.viewpager_id);
        adapter= new ViewPagerAdapter(getSupportFragmentManager());

        //add fragment here

        adapter.addFragment(new FragmentCall(),"");
        adapter.addFragment(new FragmentContact(),"");
        adapter.addFragment(new FragmentFavorate(),"");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_group);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_star);


        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);
    }
}
