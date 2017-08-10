package io.infernodz.studyweek3_lists;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.infernodz.studyweek3_lists.listview.ListViewFragment;
import io.infernodz.studyweek3_lists.recyclerview.RecyclerViewFragment;


public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private static final int NUM_PAGE = 2;

    public static final int RECYCLERVIEW_PAGE = 0;
    public static final int LISTVIEW_PAGE = 1;

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case RECYCLERVIEW_PAGE:
                return new RecyclerViewFragment();
            case LISTVIEW_PAGE:
                return new ListViewFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGE;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case RECYCLERVIEW_PAGE:
                return "RecyclerView";
            case LISTVIEW_PAGE:
                return "ListView";
            default:
                return null;
        }
    }
}
