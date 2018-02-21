package com.app.lianxi.myapplication1.vo;


import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2018/2/17.
 */

public class CosmeticsVideo extends BmobObject {

    private String uploadVideo;
    private  String uploadFee;
    private String  uploadername;
    private String  synopsis;
    private  String phone;
    private  String payment;
    private  String  nameOrCompany ;
    private  String categoryId;
    private  String adress;

    @Override
    public String toString() {
        return "CosmeticsVideo{" +
                "uploadVideo='" + uploadVideo + '\'' +
                ", uploadFee='" + uploadFee + '\'' +
                ", uploadername='" + uploadername + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", phone='" + phone + '\'' +
                ", payment='" + payment + '\'' +
                ", nameOrCompany='" + nameOrCompany + '\'' +
                ", categoryId='" + categoryId + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }



    public String getUploadVideo() {
        return uploadVideo;
    }

    public String getUploadFee() {
        return uploadFee;
    }

    public String getUploadername() {
        return uploadername;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getPhone() {
        return phone;
    }

    public String getPayment() {
        return payment;
    }

    public String getNameOrCompany() {
        return nameOrCompany;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getAdress() {
        return adress;
    }



    public void setUploadVideo(String uploadVideo) {
        this.uploadVideo = uploadVideo;
    }

    public void setUploadFee(String uploadFee) {
        this.uploadFee = uploadFee;
    }

    public void setUploadername(String uploadername) {
        this.uploadername = uploadername;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setNameOrCompany(String nameOrCompany) {
        this.nameOrCompany = nameOrCompany;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }







}
