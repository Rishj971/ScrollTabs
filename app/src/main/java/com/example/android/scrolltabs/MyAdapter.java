package com.example.android.scrolltabs;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter  extends FragmentPagerAdapter{


    public MyAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position ==0)
        {return new FragmentA();}

        else if(position == 1)
        {return  new FragmentB();}

        else
        {return new FragmentC();}
    }

    @Override
    public int getCount() {
        return 3;
    }
}
