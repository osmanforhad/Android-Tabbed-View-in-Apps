package com.osmanforhad.fragmentwithviewpagertabbedview;

import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declaration of Variable
    private TabLayout my_tl;
    private ViewPager my_vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Initial XML View using variable Within Main Method
        my_tl = (TabLayout) findViewById(R.id.my_tabs);
        my_vp = (ViewPager) findViewById(R.id.my_view_pager);

        //Call A Method for Passing ViewPager
        setUpMyViewPager(my_vp);
        //Declare this Method for call tabb layout
        my_tl.setupWithViewPager(my_vp);
    }

    //Write an Method for ViewPager
    void setUpMyViewPager(ViewPager vp){
        //Create an object for access inner class ViewPagerAdapter
        ViewPagerAdapter vpa = new ViewPagerAdapter(getSupportFragmentManager());
        vpa.addMyFragment(new FragmentOne(), "First one");
        vpa.addMyFragment(new FragmentTwo(), "Second one");
        vpa.addMyFragment(new FragmentThree(), "Third one");

        vp.setAdapter(vpa);

    }


    //Create a Custom Adapter With an Inner Class
    class ViewPagerAdapter extends FragmentPagerAdapter {
        /*Declaration of Variable with in ArrayList
        for Fragment
         and final keyword for assign it as non modified */
        private final List<Fragment> my_list = new ArrayList<Fragment>();
        /*Declaration of Variable with in ArrayList
        for Tabb Name
        and final keyword for assign it as non modified */
        private final List<String> my_titles = new ArrayList<String>();

        //Write a Constructor Method
        public ViewPagerAdapter(FragmentManager fragmentManager) {
        //Super Keyword for Reference variable
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            return my_list.get(position);
        }

        @Override
        public int getCount() {
            return my_list.size();
        }

        //Write Method for adding all of Fragment(Activity)
        void addMyFragment(Fragment f, String title){
            my_list.add(f);
            my_titles.add(title);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return my_titles.get(position);
        }

    }
}
