package com.edgarturrin.design.patterns.template_method_pattern;


public abstract class Vehicle {

    private String patent;
    private String brand;

    public Vehicle() {

    }

    public String identification() {

        String identification = "Vehicle -> Type :";
        identification = identification + getType();
        identification = identification + " -> Atributes: ";
        identification = identification + getAttributes();
        return identification;
    }

    protected abstract String getAttributes();
    protected abstract String getType();

}