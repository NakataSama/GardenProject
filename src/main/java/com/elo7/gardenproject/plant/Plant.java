package com.elo7.gardenproject.plant;

public class Plant {

    private String name;
    private PlantCategory plantCategory;

    public Plant(String name) {
        this.name = name;
    }

    public Plant(String name, PlantCategory plantCategory) {
        this.name = name;
        this.plantCategory = plantCategory;
    }

    public Plant updatePlant(Plant plant) {
        name = plant.getName();
        plantCategory = plant.getPlantCategory();
        return new Plant(name, plantCategory);
    }

    public String getName() { return name; }

    public PlantCategory getPlantCategory() { return plantCategory; }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("Name [ ").append(name).append(" ]\n")
                .append("Category [ ").append(plantCategory.getDescription()).append(" ]\n")
                .toString();
    }
}
