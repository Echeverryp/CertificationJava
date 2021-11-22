package com.java.certification.programacionFuncional.interfaesJDK;

import java.time.LocalDate;

public class ProductX implements Comparable<ProductX>{

    private String name,promotionCode,material;
    private LocalDate expirationDate;
    private float price;

    public ProductX(String name, String promotionCode, String material, LocalDate expirationDate, float price) {
        this.name = name;
        this.promotionCode = promotionCode;
        this.material = material;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductX{" +
                "name='" + name + '\'' +
                ", promotionCode='" + promotionCode + '\'' +
                ", material='" + material + '\'' +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPromotionCode() {
        return promotionCode;
    }

    public void setPromotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int compareTo(ProductX o) {

 //       return price>o.getPrice()?-1:1;//Descendente Mayor a Menor
        //return price>o.getPrice()?1:-1; //Menor a mayor
        //Se orden por el nombre de igual forma y ascendente
        return price>o.getPrice()?1
                :price==o.getPrice()? name.compareToIgnoreCase(o.getName()):-1;
    }
}
