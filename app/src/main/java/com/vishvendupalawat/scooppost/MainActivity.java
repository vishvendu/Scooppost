package com.vishvendupalawat.scooppost;

import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import com.vishvendupalawat.scooppost.TopStories.Adapters.pagerAdapter;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.HomeTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.OpinionTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.PoliticsTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.SportsTabFragment;
import com.vishvendupalawat.scooppost.TopStories.TabFragments.TechnologyTabFragment;
import com.vishvendupalawat.scooppost.root.App;

public class MainActivity extends AppCompatActivity {

    pagerAdapter pAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((App)getApplication()).getComponent().inject(this);

         toolbar = (Toolbar)findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);

         tabLayout = (TabLayout) findViewById(R.id.tabs);
         viewPager = (ViewPager) findViewById(R.id.view_pager);

         tabLayout.setupWithViewPager(viewPager);

        pAdapter = new pagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());

        pAdapter.AddFragment(new HomeTabFragment(),"Home");
        pAdapter.AddFragment(new OpinionTabFragment(),"Opinion");
        pAdapter.AddFragment(new PoliticsTabFragment(),"Politics");
        pAdapter.AddFragment(new SportsTabFragment(),"Sports");
        pAdapter.AddFragment(new TechnologyTabFragment(),"Technology");

         viewPager.setAdapter(pAdapter);

    }



}
