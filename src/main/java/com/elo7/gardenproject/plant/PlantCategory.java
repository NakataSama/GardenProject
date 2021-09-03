package com.elo7.gardenproject.plant;

import java.util.HashMap;
import java.util.Map;

public enum PlantCategory {

    ANNUAL(1, "Annual"),
    BULB(2, "Bulb"),
    CACTUS_AND_SUCCULENTS(3, "Cactus and Succulents"),
    CLIMBER(4, "Climber"),
    CONIFER(5, "Conifer"),
    FERN(6,"Fern"),
    FRUIT(7,"Fruit"),
    HERB(8,"Herb"),
    ORNAMENTAL_GRASS(9, "Ornamental Grass"),
    PERENNIAL(10,"Perennial"),
    ROSES(11, "Roses"),
    SHRUBS(12, "Shrubs"),
    TREE(13, "Tree"),
    PALM(14, "Palm - Cycads"),
    BAMBOO(15, "Bamboo"),
    AQUATIC_PLANT(16, "Aquatic Plant"),
    ORCHID(17, "Orchid");

    private int id;
    private String description;
    private static Map<Integer, PlantCategory> BY_ID;

    PlantCategory(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public static PlantCategory getPlantCategoryById(int id) {
        return PlantCategory.BY_ID.get(id);
    }

    static {
        BY_ID = new HashMap<Integer, PlantCategory>();
        for(PlantCategory plantCategory : values())
            BY_ID.put(plantCategory.getId(), plantCategory);
    }

}
