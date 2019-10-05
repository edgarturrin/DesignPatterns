package com.edgarturrin.design.patterns.builder;

public class App {

    public static void main(String[] args) {
        People people = People.builder().name("edy").build();

        System.out.print(people.getName());
    }
}
