package com.edgarturrin.design.patterns.template_method_pattern.item;

import com.edgarturrin.design.patterns.template_method_pattern.Vehicle;

public class Van extends Vehicle {

    private int id;

    public Van(int id) {
        this.id = id;
    }

    @Override
    protected String getAttributes() {
        return " long,speed ";
    }

    @Override
    protected String getType() {
        return " van ";
    }
}
