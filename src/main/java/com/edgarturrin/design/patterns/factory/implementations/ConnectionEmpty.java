package com.edgarturrin.design.patterns.factory.implementations;

import com.edgarturrin.design.patterns.factory.Connection;

public class ConnectionEmpty implements Connection {

    private String host;
    private Integer port;
    private String username;
    private String password;

    public ConnectionEmpty() {
        this.host = "host-empty";
        this.port = 6612;
        this.username = "username";
        this.password = "password";
    }

    @Override
    public void connect() {
        System.out.println("Connected database empty");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected database empty");
    }
}
