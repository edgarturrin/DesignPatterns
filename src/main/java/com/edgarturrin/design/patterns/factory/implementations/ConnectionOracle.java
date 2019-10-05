package com.edgarturrin.design.patterns.factory.implementations;

import com.edgarturrin.design.patterns.factory.Connection;

public class ConnectionOracle implements Connection {


    private String host;
    private Integer port;
    private String username;
    private String password;

    public ConnectionOracle() {
        this.host = "host-oracle";
        this.port = 2705;
        this.username = "username";
        this.password = "password";
    }

    @Override
    public void connect() {
        System.out.println("Connected database oracle");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected database oracle");
    }
}
