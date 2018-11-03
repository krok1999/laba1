package com.example.andrey.laba1.comparators;

import com.example.andrey.laba1.model.Ammunition;

import java.util.Comparator;

public class ComparatorAmmunitionByWeight implements Comparator<Ammunition> {
    @Override
    public int compare(Ammunition o1, Ammunition o2) {
        if(o1!=null && o2!=null){
            return o1.getWeight().compareTo(o2.getWeight());
        }
        else{
            if(o1!=null){
                return -1;
            }
            else return 1;
        }
    }
}
