package com.example.cafe;

public class VegModelClass {
    private String foodName;
    private String price;
    private int image;

    public VegModelClass() {

    }

    public VegModelClass(String foodName, String price, int image) {
        this.foodName = foodName;
        this.price = price;
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
