package com.elo7.gardenproject.plant;

import com.elo7.gardenproject.garden.Garden;

public class Plant {

    private String name;

    public Plant(String name) {
        this.name = name;
    }

    public Plant updateName(String nameRequest) {
        name = nameRequest;
        return new Plant(name);
    }

    public String getName() {
        return name;
    }

}
