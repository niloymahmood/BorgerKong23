package com.example.borgerkong;

public class Food {

    private int foodId;
    private String foodnName;
    private double price;
    private String desc;
    private int imageDrawableId;

    public Food(int foodId, String foodnName, double price, String desc, int imageDrawableId) {
        this.foodId = foodId;
        this.foodnName = foodnName;
        this.price = price;
        this.desc = desc;
        this.imageDrawableId = imageDrawableId;
    }

    public int getFoodId() {
        return foodId;
    }

    public String getFoodnName() {
        return foodnName;
    }

    public double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }
}


