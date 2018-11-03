package com.example.andrey.laba1.model;

public abstract class Ammunition {
    private String mName;
    private int mWeight;
    private int mPrice;

    public Ammunition() {

    }

    public Ammunition(String pName, int pWeight, int pPrice) {
        mName = pName;
        mWeight = pWeight;
        mPrice = pPrice;
    }

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight(int pWeight) {
        mWeight = pWeight;
    }

    public int getPrice() {
        return mPrice;
    }

    public void setPrice(int pPrice) {
        mPrice = pPrice;
    }
}
