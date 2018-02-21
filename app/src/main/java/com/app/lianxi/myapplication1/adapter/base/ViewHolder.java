package com.app.lianxi.myapplication1.adapter.base;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by dell on 2018/2/18.
 */

public class ViewHolder {
    public  static <T extends View> T getView(View view,int id) {
     /*   ViewHolder viewHolder=(ViewHolder)view.getTag();*/
        SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
        if (viewHolder==null) {
            viewHolder=new SparseArray<>();
            view.setTag(viewHolder);
        }
        View v=viewHolder.get(id);
        if (v==null) {
v=view.findViewById(id);
viewHolder.put(id,v);


        }
        return (T) v;
    }
}
