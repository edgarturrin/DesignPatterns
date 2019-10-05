package com.edgarturrin.design.patterns.decorator;

import com.edgarturrin.design.patterns.decorator.imp.Fiat;
import com.edgarturrin.design.patterns.decorator.imp.Ford;
import com.edgarturrin.design.patterns.decorator.wrapper.AirConditioner;
import com.edgarturrin.design.patterns.decorator.wrapper.CdPlayer;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle = new Fiat();
        vehicle = new CdPlayer(vehicle);
        vehicle = new AirConditioner(vehicle);


        System.out.println(vehicle.getDescription() + " " + vehicle.getPrice());

        Vehicle vehicle2 = new Ford();
        vehicle2 = new CdPlayer(vehicle2);
        vehicle2 = new AirConditioner(vehicle2);


        System.out.println(vehicle2.getDescription() + " " + vehicle2.getPrice());

    }
}
