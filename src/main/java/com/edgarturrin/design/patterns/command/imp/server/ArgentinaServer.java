package com.edgarturrin.design.patterns.command.imp.server;

import com.edgarturrin.design.patterns.command.Server;

public class ArgentinaServer implements Server {
    @Override
    public void turnOff() {
        System.out.println("turn off server argentina");
    }

    @Override
    public void turnOn() {
        System.out.println("turn on server argentina");

    }

    @Override
    public void verifyConnection() {
        System.out.println("verify connection server argentina");

    }

}
