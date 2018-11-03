package com.example.andrey.laba1.services;

import com.example.andrey.laba1.comparators.ComparatorAmmunitionByWeight;
import com.example.andrey.laba1.model.Ammunition;
import com.example.andrey.laba1.model.Biker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MotoService {

    private Biker mBiker;

    public MotoService(String pName) {
        mBiker = new Biker(pName);
    }

    public int getCostAmmunition() {
        int sumCost = 0;
        for (int i = 0; i < mBiker.getAmmunitionList().size(); i++) {
            sumCost += mBiker.getAmmunitionList().get(i).getPrice();
        }
        return sumCost;
    }

    public void sortAmmunitionByWeight(){
        List<Ammunition>ammunitionList = mBiker.getAmmunitionList().sort(new ComparatorAmmunitionByWeight());
    }

    public List<Ammunition> getElementByDiapazone(int pLowRange, int pHighRange){
        if(pHighRange<pLowRange){
            return null;
        }
        List<Ammunition>ammunitionList = new ArrayList<>();
        for(int i = 0; i < mBiker.getAmmunitionList().size(); i++){
            if(mBiker.getAmmunitionList().get(i).getWeight()>pLowRange &&
                    mBiker.getAmmunitionList().get(i).getWeight()<pHighRange){
                ammunitionList.add(mBiker.getAmmunitionList().get(i));
            }
        }
        return ammunitionList;
    }
}
