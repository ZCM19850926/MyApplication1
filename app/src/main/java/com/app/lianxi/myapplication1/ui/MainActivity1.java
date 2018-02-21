package com.app.lianxi.myapplication1.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;


import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.adapter.base.ViewHolder;
import com.app.lianxi.myapplication1.ui.fragment.HomeFragment;
import com.app.lianxi.myapplication1.ui.fragment.LauncherFragment;
import com.app.lianxi.myapplication1.ui.fragment.PersonalFragment;


import java.util.ArrayList;

import cn.bmob.v3.Bmob;


public class MainActivity1 extends BaseActivity {
    private Button button_tab_home, button3_tab_share, button4_tab_personal;
    private ViewPager viewPager;
    private MyPagerAdapter myPagerAdapter;
    private HomeFragment homeFragment;

    private LauncherFragment launcherFragment;
    private PersonalFragment personalFragment;

    private ArrayList<Fragment> fragments = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bmob.initialize(this, "17dbf3280d5b5eeb3114dc8de02e76a8");
        setContentView(R.layout.activity_main1);


        initView();


    }

    public void initView() {

        button_tab_home = (Button) findViewById(R.id.button_tab_home);

        button3_tab_share = (Button) findViewById(R.id.button3_tab_share);
        button4_tab_personal = (Button) findViewById(R.id.button4_tab_personal);

        defaultButton();
        viewPager = (ViewPager) findViewById(R.id.viewPage);
        homeFragment = new HomeFragment();

        launcherFragment = new LauncherFragment();
        personalFragment = new PersonalFragment();

        fragments.add(homeFragment);

        fragments.add(launcherFragment);
        fragments.add(personalFragment);

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myPagerAdapter);
        viewPager.setCurrentItem(0);


    }

    public void tabSelectClick(View view) {
        changeTab(view);


    }

    public void defaultButton() {
        button_tab_home.setSelected(true);

        button3_tab_share.setSelected(false);
        button4_tab_personal.setSelected(false);
    }

    /**
     * 切换标签
     */
    public void changeTab(final View view) {
        switch (view.getId()) {
            case R.id.button_tab_home:

                button_tab_home.setSelected(true);

                button3_tab_share.setSelected(false);
                button4_tab_personal.setSelected(false);
                viewPager.setCurrentItem(0);
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                    }

                    @Override
                    public void onPageSelected(int position) {
/*viewPager.setCurrentItem(position);*/
                        switch (position) {
                            case 0:
                        changeTab(button_tab_home);
                                break;

                            case 1:
                                changeTab(button3_tab_share);
                                break;
                            case 2:
                                changeTab(button4_tab_personal);
                                break;
                                default:
                                    break;
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged(int state) {

                    }
                });





                break;


            case R.id.button3_tab_share:
                button_tab_home.setSelected(false);

                button3_tab_share.setSelected(true);
                button4_tab_personal.setSelected(false);
                viewPager.setCurrentItem(1);
                break;

            case R.id.button4_tab_personal:
                button_tab_home.setSelected(false);

                button3_tab_share.setSelected(false);
                button4_tab_personal.setSelected(true);
                viewPager.setCurrentItem(2);
                break;
            default:
                break;
        }


    }



    class MyPagerAdapter extends FragmentPagerAdapter {
        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);


        }

        @Override
        public int getCount() {
            return fragments.size();

        }

    }


}
