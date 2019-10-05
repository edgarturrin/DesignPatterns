package com.edgarturrin.design.patterns.template_method_pattern.item;

import com.edgarturrin.design.patterns.template_method_pattern.Vehicle;

public class Car extends Vehicle {

    private int id;

    public Car(int id) {
        this.id = id;
    }

    @Override
    protected String getAttributes() {
        return " small,speed";
    }

    @Override
    protected String getType() {
        return " car ";
    }
}
