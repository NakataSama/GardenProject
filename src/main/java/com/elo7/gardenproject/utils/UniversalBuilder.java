package com.elo7.gardenproject.utils;

import com.elo7.gardenproject.garden.Garden;
import com.elo7.gardenproject.owner.Owner;
import com.elo7.gardenproject.plant.Plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversalBuilder {

    public Owner build() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type your name:");
        String name = sc.next();

        System.out.println("How many gardens do you want to build?");
        int numberOfGardens = sc.nextInt();

        Owner owner = new Owner(name);

        for (int i = 0; i < numberOfGardens; i++) {
            String gardenName = "My Garden " + (i+1);

            System.out.println("How many plants in " + gardenName);
            int numberOfPlants = sc.nextInt();

            owner = owner.addGarden(new Garden(gardenName, owner, buildPlants(numberOfPlants)));
        }
        sc.close();
        return owner;
    }

    private List<Plant> buildPlants(int numberOfPlants) {

        List<Plant> plants = new ArrayList<>();

        for (int i = 0; i < numberOfPlants; i++) {
            plants.add(new Plant("Plant " + (i+1)));
        }

        return plants;
    }

}
