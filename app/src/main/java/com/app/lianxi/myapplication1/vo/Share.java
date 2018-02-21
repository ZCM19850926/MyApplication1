package com.app.lianxi.myapplication1.vo;


import java.sql.Statement;

import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2018/2/17.
 */

public class Share extends BmobObject {

    private String XShare;//享用者的电话//
    private  String gName;//
    private  String CategoryId;//
    private Number Deposit;//
    private  String Image;//
    private  String NewOld;//
    private String Notes1;//
    private  String Phone;//
    private  Number Price;//这个什么意思？字段？上传的价格//
    private  Number Sprice;//
    private  String SecondHandPrice;//
    private  String Star;//
    private Number Stock;//
    private String SatementOfPayment;//
    private String Wname;//
    private String Xname;//
    private String BriefIntroduction;//
    private String annotation;//
    private String address;//
    private String sProduct;//
    @Override
    public String toString() {
        return "Share{" +
                "XShare='" + XShare + '\'' +
                ", gName='" + gName + '\'' +
                ", CategoryId='" + CategoryId + '\'' +
                ", Deposit=" + Deposit +
                ", Image='" + Image + '\'' +
                ", NewOld='" + NewOld + '\'' +
                ", Notes1='" + Notes1 + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Price=" + Price +
                ", Sprice=" + Sprice +
                ", SecondHandPrice='" + SecondHandPrice + '\'' +
                ", Star='" + Star + '\'' +
                ", Stock=" + Stock +
                ", SatementOfPayment='" + SatementOfPayment + '\'' +
                ", Wname='" + Wname + '\'' +
                ", Xname='" + Xname + '\'' +
                ", BriefIntroduction='" + BriefIntroduction + '\'' +
                ", annotation='" + annotation + '\'' +
                ", address='" + address + '\'' +
                ", sProduct='" + sProduct + '\'' +
                '}';
    }


    public void setXShare(String XShare) {
        this.XShare = XShare;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public void setDeposit(Number deposit) {
        Deposit = deposit;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setNewOld(String newOld) {
        NewOld = newOld;
    }

    public void setNotes1(String notes1) {
        Notes1 = notes1;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public void setPrice(Number price) {
        Price = price;
    }

    public void setSprice(Number sprice) {
        Sprice = sprice;
    }

    public void setSecondHandPrice(String secondHandPrice) {
        SecondHandPrice = secondHandPrice;
    }

    public void setStar(String star) {
        Star = star;
    }

    public void setStock(Number stock) {
        Stock = stock;
    }

    public void setSatementOfPayment(String satementOfPayment) {
        SatementOfPayment = satementOfPayment;
    }

    public void setWname(String wname) {
        Wname = wname;
    }

    public void setXname(String xname) {
        Xname = xname;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        BriefIntroduction = briefIntroduction;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setsProduct(String sProduct) {
        this.sProduct = sProduct;
    }




    public String getXShare() {
        return XShare;
    }

    public String getgName() {
        return gName;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public Number getDeposit() {
        return Deposit;
    }

    public String getImage() {
        return Image;
    }

    public String getNewOld() {
        return NewOld;
    }

    public String getNotes1() {
        return Notes1;
    }

    public String getPhone() {
        return Phone;
    }

    public Number getPrice() {
        return Price;
    }

    public Number getSprice() {
        return Sprice;
    }

    public String getSecondHandPrice() {
        return SecondHandPrice;
    }

    public String getStar() {
        return Star;
    }

    public Number getStock() {
        return Stock;
    }

    public String getSatementOfPayment() {
        return SatementOfPayment;
    }

    public String getWname() {
        return Wname;
    }

    public String getXname() {
        return Xname;
    }

    public String getBriefIntroduction() {
        return BriefIntroduction;
    }

    public String getAnnotation() {
        return annotation;
    }

    public String getAddress() {
        return address;
    }

    public String getsProduct() {
        return sProduct;
    }







}
