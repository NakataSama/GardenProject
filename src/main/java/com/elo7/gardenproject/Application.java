package com.elo7.gardenproject;

import com.elo7.gardenproject.owner.Owner;
import com.elo7.gardenproject.utils.UniversalBuilder;

public class Application {

    public static void main(String[] args) {
        Owner owner = new UniversalBuilder().build();
        System.out.println(owner);
        owner.getBiggestGarden().printCurrentCategories();
    }

}
