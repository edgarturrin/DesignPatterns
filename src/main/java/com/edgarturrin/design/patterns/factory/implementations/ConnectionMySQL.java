package com.edgarturrin.design.patterns.factory.implementations;

import com.edgarturrin.design.patterns.factory.Connection;

public class ConnectionMySQL implements Connection {


    private String host;
    private Integer port;
    private String username;
    private String password;

    public ConnectionMySQL() {
        this.host = "host-mysql";
        this.port = 6612;
        this.username = "username";
        this.password = "password";
    }

    @Override
    public void connect() {
        System.out.println("Connected database mysql");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected database mysql");
    }
}
