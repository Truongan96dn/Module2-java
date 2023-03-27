package io_binary_file.product_managerment.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String dateofManufature;
    private String color;

    public Product() {
    }

    public Product(int id, String nameProduct, String dateofManufature, String color) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.dateofManufature = dateofManufature;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDateofManufature() {
        return dateofManufature;
    }

    public void setDateofManufature(String dateofManufature) {
        this.dateofManufature = dateofManufature;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", dateofManufature='" + dateofManufature + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getInfoToCSV() {
        return this.id + "," + this.nameProduct + "," + this.dateofManufature + "," + this.color;
    }
}
