package com.edgarturrin.design.patterns.decorator.wrapper;

import com.edgarturrin.design.patterns.decorator.CarDecorator;
import com.edgarturrin.design.patterns.decorator.Vehicle;

public class CdPlayer extends CarDecorator {

    public CdPlayer(Vehicle sales) {
        super(sales);
    }

    @Override
    public String getDescription() {
        return getVehicle().getDescription() + " + Cd Player";
    }

    @Override
    public Integer getPrice() {
        return getVehicle().getPrice() + 10000;
    }
}
