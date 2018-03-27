package be.ehb.demotabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Q on 20-2-2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    //constructor aangemaakt door alt-enter op de klasse-naam
    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    //welk fragment per tab
    @Override
    public Fragment getItem(int position) {

        //spreek de constructor niet aan om fragment aan te maken, in plaats daarvan roep de newInstance-methode van MainFragment aan om fragment aan te maken
        MainFragment mMainFragment = MainFragment.newInstance();
        AboutFragment mAboutFragment = AboutFragment.newInstance();

        switch (position) {
            case 0: return mMainFragment;
            case 1: return mAboutFragment;
        }

        return mMainFragment;
    }


    //hoeveel tabs
    @Override
    public int getCount() {
        return 2;
    }


    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case 0: return "Home";
            case 1: return "About";


        }
        return "Dit kan niet"; //deze message zouden we normaal gezien niet zien: voor een tab die niet bestaat.



    }
}
