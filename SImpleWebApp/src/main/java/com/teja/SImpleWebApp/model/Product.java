package com.teja.SImpleWebApp.model;

public class Product {

    private int proId;
    private String prodName;
    private int price;

    public Product(int proId, String prodName, int price) {
        this.proId = proId;
        this.prodName = prodName;
        this.price = price;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
