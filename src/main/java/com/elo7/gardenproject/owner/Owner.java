package com.elo7.gardenproject.owner;

import com.elo7.gardenproject.garden.Garden;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Owner {

    private String name;
    private List<Garden> gardens = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public Owner(String name, List<Garden> gardens) {
        this.name = name;
        this.gardens = gardens;
    }

    public String getName() {
        return name;
    }

    public void setGardens(List<Garden> gardens) {
        this.gardens = gardens;
    }

    public List<Garden> getGardens() {
        return gardens;
    }

    public Owner addGarden(Garden garden) {
        gardens.add(garden);
        return new Owner(name, gardens);
    }

    public Garden getBiggestGarden() {
        return gardens.stream().max(Comparator.comparing(Garden::getPlantsCount)).get();
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(name).append("\'s Private Forest\n")
                .append("================\n")
                .append("Currently you own ").append(gardens.size()).append(" gardens\n")
                .append("================\n")
                .append("Your biggest garden has ").append(getBiggestGarden().getPlantsCount()).append(" plants")
                .append(" and it's named ").append(getBiggestGarden().getName()).append("\n")
                .append(getBiggestGarden())
                .toString();
    }
}
