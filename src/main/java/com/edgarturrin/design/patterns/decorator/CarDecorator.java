package com.edgarturrin.design.patterns.decorator;

public abstract class CarDecorator implements Vehicle {

    protected Vehicle vehicle;

    public CarDecorator(Vehicle sales) {
        this.vehicle = sales;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
