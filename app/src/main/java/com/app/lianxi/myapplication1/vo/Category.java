package com.app.lianxi.myapplication1.vo;


import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2018/2/17.
 */

public class Category extends BmobObject {
    private String categoryname;



    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }



    public String getCategoryname() {
        return categoryname;
    }

}
