package com.example.testmodule4.service;

import java.util.Date;

public class OderDTO {
    private Long id;
    private String nameProduct;
    private String price;
    private String category;
    private Date datePrice;
    private int quantity;
    private double totalPrice;

    public OderDTO(Long id, String nameProduct, String price, String category, Date datePrice, int quantity, double totalPrice) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
        this.category = category;
        this.datePrice = datePrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDatePrice() {
        return datePrice;
    }

    public void setDatePrice(Date datePrice) {
        this.datePrice = datePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
