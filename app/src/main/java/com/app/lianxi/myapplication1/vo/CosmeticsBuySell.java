package com.app.lianxi.myapplication1.vo;


import cn.bmob.v3.BmobObject;

/**
 * Created by dell on 2018/2/17.
 */

public class CosmeticsBuySell extends BmobObject {

    private String Telephone;
    private  String Annotation;
    private String BriefIntroduction;
    private String CategoryId;
    private  String Explain;
    private  String Image;
    private  String Name;
    private  String NewAndOldProducts;
    private String Price;
    private  String SellProduct;
    private  String Sprice;//这个什么意思？字段？上传的价格
    private  String Star;
    private  String Stock;
    private  String Adress;

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public void setAnnotation(String annotation) {
        Annotation = annotation;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        BriefIntroduction = briefIntroduction;
    }

    public void setCategoryId(String categoryId) {
        CategoryId = categoryId;
    }

    public void setExplain(String explain) {
        Explain = explain;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setNewAndOldProducts(String newAndOldProducts) {
        NewAndOldProducts = newAndOldProducts;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setSellProduct(String sellProduct) {
        SellProduct = sellProduct;
    }

    public void setSprice(String sprice) {
        Sprice = sprice;
    }

    public void setStar(String star) {
        Star = star;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }



    public String getTelephone() {
        return Telephone;
    }

    public String getAnnotation() {
        return Annotation;
    }

    public String getBriefIntroduction() {
        return BriefIntroduction;
    }

    public String getCategoryId() {
        return CategoryId;
    }

    public String getExplain() {
        return Explain;
    }

    public String getImage() {
        return Image;
    }

    public String getName() {
        return Name;
    }

    public String getNewAndOldProducts() {
        return NewAndOldProducts;
    }

    public String getPrice() {
        return Price;
    }

    public String getSellProduct() {
        return SellProduct;
    }

    public String getSprice() {
        return Sprice;
    }

    public String getStar() {
        return Star;
    }

    public String getStock() {
        return Stock;
    }

    public String getAdress() {
        return Adress;
    }


    @Override
    public String toString() {
        return "CosmeticsBuySell{" +
                "Telephone='" + Telephone + '\'' +
                ", Annotation='" + Annotation + '\'' +
                ", BriefIntroduction='" + BriefIntroduction + '\'' +
                ", CategoryId='" + CategoryId + '\'' +
                ", Explain='" + Explain + '\'' +
                ", Image='" + Image + '\'' +
                ", Name='" + Name + '\'' +
                ", NewAndOldProducts='" + NewAndOldProducts + '\'' +
                ", Price='" + Price + '\'' +
                ", SellProduct='" + SellProduct + '\'' +
                ", Sprice='" + Sprice + '\'' +
                ", Star='" + Star + '\'' +
                ", Stock='" + Stock + '\'' +
                ", Adress='" + Adress + '\'' +
                '}';
    }
}
