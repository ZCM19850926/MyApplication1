package com.app.lianxi.myapplication1.ui.fragment;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.JobIntentService;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.ui.SearchActivity;
import com.astuetz.PagerSlidingTabStrip;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.lang.reflect.Type;
import java.util.ArrayList;

import cn.bmob.v3.BmobQuery;

/**
 * Created by dell on 2018/2/15.
 */

public class LauncherFragment extends Fragment implements View.OnClickListener{
private PagerSlidingTabStrip pgerSlidingTabStrip;
private ViewPager viewPager;
private LinearLayout ll_search_btn_contatiner;
private TextView tv_search_show;
private LinearLayout load_layout;
private ArrayList<Fragment> fragments=new ArrayList<>();
private MyPagerAdapter myPagerAdapter;





    private ImageIndicatorView indicate_View;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_share,null);
        initView(view);

            return view;
    }
public void initView(View view){
    tv_search_show=(TextView) view.findViewById(R.id.tv_search_show);
    tv_search_show.setOnClickListener(this);
    pgerSlidingTabStrip=(PagerSlidingTabStrip)view.findViewById(R.id.tabs0026);
    viewPager=(ViewPager) view.findViewById(R.id.pager);

    fragments.add(new MakeupVideo());
    fragments.add(new SellingCosmetics());
    fragments.add(new SharingCosmetics());
    myPagerAdapter=new MyPagerAdapter(getFragmentManager());
    viewPager.setAdapter(myPagerAdapter);



    final int pageMargin=(int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,4,getResources().getDisplayMetrics());
    viewPager.setPageMargin(pageMargin);
    pgerSlidingTabStrip.setViewPager(viewPager);
    pgerSlidingTabStrip.setIndicatorColor(0xfff6f6f6);//指示器
    pgerSlidingTabStrip.setTextColor(0xfff6f6f);
    pgerSlidingTabStrip.setBackgroundColor(0xFFF6F6F6);//背景
    pgerSlidingTabStrip.setTypeface(Typeface.DEFAULT,0);//字体类型


    viewPager.setCurrentItem(0);
}

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(getActivity(), SearchActivity.class);
        startActivity(intent);
    }

    class MyPagerAdapter extends FragmentPagerAdapter{
    private String[] titles={"妆容教程","妆品销售","共享世界"};

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

 public CharSequence getPageTitle(int position){
        return titles[position];
 }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.length;
    }
}









}
