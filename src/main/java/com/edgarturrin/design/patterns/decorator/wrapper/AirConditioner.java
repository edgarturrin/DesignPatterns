package com.edgarturrin.design.patterns.decorator.wrapper;

import com.edgarturrin.design.patterns.decorator.CarDecorator;
import com.edgarturrin.design.patterns.decorator.Vehicle;

public class AirConditioner extends CarDecorator {

    public AirConditioner(Vehicle sales) {
        super(sales);
    }

    @Override
    public String getDescription() {
        return getVehicle().getDescription() + " + Air conditioner";
    }

    @Override
    public Integer getPrice() {
        return getVehicle().getPrice() + 20000;
    }
}
