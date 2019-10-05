package com.edgarturrin.design.patterns.template_method_pattern;

import com.edgarturrin.design.patterns.template_method_pattern.item.Van;
import com.edgarturrin.design.patterns.template_method_pattern.item.Car;

public class App {

    public static void main(String[] args) {

        Vehicle p = new Van(123);

        System.out.println("the van: ");
        System.out.println(p.identification());

        System.out.println("the car: ");
        p = new Car( 456);
        System.out.println(p.identification());

    }
}
