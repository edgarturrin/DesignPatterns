package com.edgarturrin.design.patterns.command.imp.server;

import com.edgarturrin.design.patterns.command.Server;

public class UruguayServer implements Server {

    @Override
    public void turnOff() {
        System.out.println("turn off server uruguay");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on server uruguay");

    }

    @Override
    public void verifyConnection() {
        System.out.println("verify connection server uruguay");

    }

}
