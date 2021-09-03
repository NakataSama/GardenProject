package com.elo7.gardenproject.garden;

import com.elo7.gardenproject.owner.Owner;
import com.elo7.gardenproject.plant.Plant;
import com.elo7.gardenproject.plant.PlantCategory;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Garden {

    private String name;
    private Owner owner;
    private List<Plant> plants;

    public Garden(String name, Owner owner, List<Plant> plants) {
        this.name = name;
        this.owner = owner;
        this.plants = plants;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public int getPlantsCount() {
        return plants.size();
    }

    public Garden addPlants(List<Plant> newPlants) {
        plants.addAll(newPlants);
        return new Garden(name, owner, plants);
    }

    public Garden addPlants(Plant newPlant) {
        plants.add(newPlant);
        return new Garden(name, owner, plants);
    }

    public Garden removePlant(String nameRequest) {
        Plant toBeRemoved = getPlantByName(nameRequest);

        if(toBeRemoved == null)
            return new Garden(name, owner, plants);
        else
            plants.remove(toBeRemoved);
            return new Garden(name, owner, plants);
    }

    public Plant getPlantByName(String name) {
        return plants.stream()
                .filter(p -> p.getName().toLowerCase().equalsIgnoreCase(name))
                .findAny()
                .orElse(null);
    }

    public List<PlantCategory> getSortedDistinctPlantCategories() {
        return plants.stream()
                .map(Plant::getPlantCategory)
                .sorted(Comparator.comparing(PlantCategory::getDescription))
                .distinct()
                .collect(Collectors.toList());
    }

    private long getNumberOfDistinctPlantCategories() {;
        return getSortedDistinctPlantCategories().size();
    }

    public void printCurrentCategories() {
        getSortedDistinctPlantCategories()
                .forEach(plantCategory -> System.out.println(plantCategory.getDescription()));
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("This garden is called ").append(name + ".\n")
                .append("It has ").append(getPlantsCount()).append(" plants")
                .append(", from ").append(getNumberOfDistinctPlantCategories()).append(" different categories.")
                .toString();
    }
}