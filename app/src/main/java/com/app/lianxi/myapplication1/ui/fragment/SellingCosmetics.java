package com.app.lianxi.myapplication1.ui.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.ListView;


import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.adapter.base.ListItemAdapter;
import com.app.lianxi.myapplication1.ui.MainActivity1;
import com.app.lianxi.myapplication1.vo.CosmeticsBuySell;
import com.app.lianxi.myapplication1.vo.Share;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

/**
 * Created by dell on 2018/2/19.
 */

public class SellingCosmetics extends Fragment {
    private MainActivity1 mainActivity1;
    private ListView listView2_category_sell;
    private  LinearLayout load_layout;
private ArrayList<Share> cosmeticsBuySells=new ArrayList<>();
    ListItemAdapter listItemAdapter;


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mainActivity1= (MainActivity1) getActivity();
        
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_category,null);
        listView2_category_sell=(ListView) view.findViewById(R.id.listView2_category);
        load_layout=view.findViewById(R.id.load_layout);
        listItemAdapter=new ListItemAdapter(mainActivity1,cosmeticsBuySells);
        listView2_category_sell.setAdapter(listItemAdapter);


        loadata();
        return view;
    }
    private void loadata() {
        if (cosmeticsBuySells.size()==0) {
load_layout.setVisibility(View.VISIBLE);
listView2_category_sell.setVisibility(View.GONE);
            BmobQuery<Share> query=new BmobQuery<>();
            query.setCachePolicy(BmobQuery.CachePolicy.CACHE_ELSE_NETWORK);
            query.addWhereEqualTo("CategoryId","WrJv888N");
            query.findObjects(new FindListener<Share>() {
                @Override
                public void done(List<Share> list, BmobException e) {
                    load_layout.setVisibility(View.GONE);
                    listView2_category_sell.setVisibility(View.VISIBLE);
                    listItemAdapter.setCosmeticsBuySells((ArrayList<Share>) list);
                    listItemAdapter.notifyDataSetChanged();
                }

//                @Override
//                public void onSuccess(List<CosmeticsBuySell> list) {
//
//                }
//                @Override
//                public void onError(int i,String list) {
//                    load_layout.setVisibility(View.GONE);
//                    listView2_category_sell.setVisibility(View.VISIBLE);
//                }
            });























        }



    }

//    @Override
//    public void onClick(View v) {
//
//    }
}
