package com.edgarturrin.design.patterns.decorator.imp;

import com.edgarturrin.design.patterns.decorator.Car;

public class Ford extends Car {

    private String description = "Ford model 2019";
    private Integer price = 250000;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Integer getPrice() {
        return price;
    }

}
