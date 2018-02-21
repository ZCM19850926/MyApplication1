package com.app.lianxi.myapplication1.vo;


import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2018/2/17.
 */

public class Oders1 extends BmobObject {

    private Number total;
    private  Number Subtotal;
    private  Number Status;
    private  Number CosmeticsId;
    public Number getTotal() {
        return total;
    }

    public Number getSubtotal() {
        return Subtotal;
    }

    public Number getStatus() {
        return Status;
    }

    public Number getCosmeticsId() {
        return CosmeticsId;
    }

    public void setTotal(Number total) {
        this.total = total;
    }

    public void setSubtotal(Number subtotal) {
        Subtotal = subtotal;
    }

    public void setStatus(Number status) {
        Status = status;
    }

    public void setCosmeticsId(Number cosmeticsId) {
        CosmeticsId = cosmeticsId;
    }










}
