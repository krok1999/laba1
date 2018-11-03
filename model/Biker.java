package com.example.andrey.laba1.model;

import java.util.ArrayList;
import java.util.List;

public class Biker {
    private String mName;
    private List<Ammunition> mAmmunitionList;

    public Biker(){

    }

    public Biker(String pName) {
        mName = pName;
        mAmmunitionList = new ArrayList<>();
    }

    public Biker(String pName, List<Ammunition> pAmmunitionList) {
        mName = pName;
        mAmmunitionList = pAmmunitionList;
    }

    public List<Ammunition> getAmmunitionList() {
        return mAmmunitionList;
    }

    public void setAmmunitionList(List<Ammunition> pAmmunitionList) {
        mAmmunitionList = pAmmunitionList;
    }

    public String getName() {
        return mName;
    }

    public void setName(String pName) {
        mName = pName;
    }

    public void addItemAmmunition(Ammunition pAmmunition){
        mAmmunitionList.add(pAmmunition);
    }
}
