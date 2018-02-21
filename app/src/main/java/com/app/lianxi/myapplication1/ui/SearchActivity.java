package com.app.lianxi.myapplication1.ui;


import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageButton;
;
import android.widget.ListView;

import com.app.lianxi.myapplication1.R;
import com.app.lianxi.myapplication1.adapter.base.ListItemAdapter;
import com.app.lianxi.myapplication1.utils.AppUtils;
import com.app.lianxi.myapplication1.vo.CosmeticsBuySell;
import com.app.lianxi.myapplication1.vo.CosmeticsVideo;
import com.app.lianxi.myapplication1.vo.Share;

import java.util.ArrayList;
import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
/**
 * 搜索所有内容
 *
 * */
public class SearchActivity extends BaseActivity implements View.OnClickListener {
    private EditText et_search_content;
    private ImageButton ib_search_btn;
private ListView listView_search;
private ListItemAdapter listItemAdapter;
private  View loading_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        et_search_content= (EditText)findViewById(R.id.et_search_content);
                ib_search_btn=(ImageButton) findViewById(R.id.ib_search_btn);
        listView_search=(ListView) findViewById(R.id.listView_search);
        ib_search_btn.setOnClickListener(this);
        loading_data=findViewById(R.id.loading_data);
        loading_data.setVisibility(View.GONE);



    }
   @Override
    public void onClick(View v){
        String search_content=et_search_content.getText().toString();
       if (TextUtils.isEmpty(search_content)) {
           showToast("请输入搜索内容");
       return;

   }
       AppUtils.hideInputMethod(v);
searchVideoAndCosmetics();

}



    //搜索所有的内容关键字
    private void searchVideoAndCosmetics() {
        loading_data.setVisibility(View.VISIBLE);
        listView_search.setVisibility(View.GONE);
        BmobQuery<CosmeticsBuySell> query=new BmobQuery<>();
        BmobQuery<CosmeticsVideo> query1=new BmobQuery<>();
        BmobQuery<Share> query2=new BmobQuery<>();

        query.addWhereContains("Name",search_content);
        query.addWhereContains("uploadername",search_content);
        query.addWhereContains("gName",search_content);
query.findObjects(this, new FindListener<CosmeticsBuySell>() {


    @Override
    public void onSuccess(List<CosmeticsBuySell> list) {
        listItemAdapter=new ListItemAdapter(SearchActivity.this, (ArrayList<CosmeticsBuySell>) list);
        listView_search.setAdapter(listItemAdapter);
        loading_data.setVisibility(View.GONE);
        listView_search.setVisibility(View.VISIBLE);
    }
    @Override
    public void onError(int i,String s){
        loading_data.setVisibility(View.GONE);
        listView_search.setVisibility(View.VISIBLE);
    }
});


        query.findObjects(this, new FindListener<CosmeticsVideo>() {


            @Override
            public void onSuccess(List<CosmeticsVideo> list) {
                listItemAdapter=new ListItemAdapter(SearchActivity.this,(ArrayList<CosmeticsVideo>) list);
                listView_search.setAdapter(listItemAdapter);
                loading_data.setVisibility(View.GONE);
                listView_search.setVisibility(View.VISIBLE);
            }
            @Override
            public void onError(int i,String s){
                loading_data.setVisibility(View.GONE);
                listView_search.setVisibility(View.VISIBLE);
            }
        });

        query.findObjects(this, new FindListener<Share>() {


            @Override
            public void onSuccess(List<Share> list) {
                listItemAdapter=new ListItemAdapter(SearchActivity.this, (ArrayList<Share>) list);
                listView_search.setAdapter(listItemAdapter);
                loading_data.setVisibility(View.GONE);
                listView_search.setVisibility(View.VISIBLE);
            }
            @Override
            public void onError(int i,String s){
                loading_data.setVisibility(View.GONE);
                listView_search.setVisibility(View.VISIBLE);
            }
        });











    }
    }
