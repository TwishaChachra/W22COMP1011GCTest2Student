package com.example.w22comp1011gctest2student;

public class Product {
  private int sku;
  private String name;

  public Product(int sku, String name, double salePrice, double regularPrice, String urlImage) {
    this.sku = sku;
    this.name = name;
    this.salePrice = salePrice;
    this.regularPrice = regularPrice;
    this.urlImage = urlImage;
  }

  public void setSku(int sku) {
    this.sku = sku;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalePrice(double salePrice) {
    this.salePrice = salePrice;
  }

  public void setRegularPrice(double regularPrice) {
    this.regularPrice = regularPrice;
  }

  public void setUrlImage(String urlImage) {
    this.urlImage = urlImage;
  }

  private double salePrice;
  private double regularPrice;
  private String urlImage;

  @java.lang.Override
  public java.lang.String toString() {
    String formattedSalesPrice = String.format("%.2f", salePrice)
    return name + "-$" + formattedSalesPrice;
  }
}
