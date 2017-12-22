package com.vishvendupalawat.scooppost.TopStories.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.vishvendupalawat.scooppost.TopStories.TabFragments.HomeTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.OpinionTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.PoliticsTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.SportsTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.TechnologyTabFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vishvendu on 22/12/17.
 */

public class pagerAdapter extends FragmentPagerAdapter{

    int NumberOfTabs;
    public List<Fragment> fragments = new ArrayList<>();
    public List<String> PageTitles = new ArrayList<>();


    public pagerAdapter(FragmentManager fm,int NumberOfTabs) {
        super(fm);
        this.NumberOfTabs = NumberOfTabs;
    }


    public void AddFragment(Fragment fragment,String titles){


        fragments.add(fragment);
        PageTitles.add(titles);
    }

    @Override
    public Fragment getItem(int position) {


        return fragments.get(position);

    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return PageTitles.get(position);
    }
}
