package com.app.lianxi.myapplication1.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.adapter.base.ListItemAdapter;
import com.app.lianxi.myapplication1.ui.MainActivity1;
import com.app.lianxi.myapplication1.vo.CosmeticsBuySell;
import com.panxw.android.imageindicator.AutoPlayManager;
import com.panxw.android.imageindicator.ImageIndicatorView;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * Created by dell on 2018/2/15.
 */

public class HomeFragment extends Fragment {
    private ImageIndicatorView indicate_View;
    private ListView listView;
    private View loading_data;
    private MainActivity1 mainActivity1;
    private ArrayList<CosmeticsBuySell> cosmeticsBuySells=new ArrayList<>();
    private ListItemAdapter listItemAdapter;



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        mainActivity1=(MainActivity1) getActivity();

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_home,null);
        loading_data=view.findViewById(R.id.loading_data);
        loading_data.setVisibility(View.GONE);
        initIndicateView(view);
        listView=(ListView)view.findViewById(R.id.listView);
        listItemAdapter=new ListItemAdapter(mainActivity1,cosmeticsBuySells);
        listView.setAdapter(listItemAdapter);





loadDate();


            return view;
    }
    //初始化主页上的列表数据
private void loadDate(){
      //
    if(cosmeticsBuySells.size()==0) {
        loading_data.setVisibility(View.VISIBLE);
        listView.setVisibility(View.GONE);
        BmobQuery<CosmeticsBuySell> query = new BmobQuery<>();
        query.setCachePolicy(BmobQuery.CachePolicy.CACHE_ELSE_NETWORK);//先从缓存中取数据,没有再从网络上取



        query.addWhereEqualTo("Star","4");
        query.findObjects(new FindListener<CosmeticsBuySell>(){
            @Override
            public void done(List<CosmeticsBuySell> list, BmobException e) {
                cosmeticsBuySells=(ArrayList<CosmeticsBuySell>) list;
                Log.i("tag", "打印出"+cosmeticsBuySells);
                listItemAdapter.setCosmeticsBuySells(cosmeticsBuySells);
                listItemAdapter.notifyDataSetChanged();

                loading_data.setVisibility(View.GONE);
                listView.setVisibility(View.VISIBLE);

            }
           public void onSuccess(List<CosmeticsBuySell> list) {



           }
           public void onError(int i, String s) {
               loading_data.setVisibility(View.GONE);
               listView.setVisibility(View.VISIBLE);
      }


        });

    }



}
    private void initIndicateView(View view) {
        indicate_View=(ImageIndicatorView)view.findViewById(R.id.indicate_view);
        final Integer[] resArray = new Integer[] { R.mipmap.ic_launcher1,R.mipmap.ic_launcher4,R.mipmap.ic_launcher3,R.mipmap.ic_launcher4};
        indicate_View.setupLayoutByDrawable(resArray);
        indicate_View.setIndicateStyle(ImageIndicatorView.INDICATE_USERGUIDE_STYLE);
        indicate_View.show();
   /*    AutoPlayManager autoBrocastManager =  new AutoPlayManager(indicate_View);
     autoBrocastManager.setBroadcastEnable(true);
        autoBrocastManager.setBroadCastTimes(5);//loop times
        autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//set first play time and interval
        autoBrocastManager.loop();*/
        AutoPlayManager autoBrocastManager =  new AutoPlayManager(indicate_View);
        autoBrocastManager.setBroadcastEnable(true);
        autoBrocastManager.setBroadCastTimes(5);//loop times
        autoBrocastManager.setBroadcastTimeIntevel(3 * 1000, 3 * 1000);//set first play time and interval
        autoBrocastManager.loop();
    }
}
