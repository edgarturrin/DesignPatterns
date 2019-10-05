package com.edgarturrin.design.patterns.abstract_factory.implementations;

import com.edgarturrin.design.patterns.abstract_factory.Connection;

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
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Connected database oracle "+this.toString());
    }

    @Override
    public void disconnect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Disconnected database oracle "+this.toString());
    }

    @Override
    public String toString() {
        return "connection_oracle:{" +
                "'host':" + host + '\'' +
                ", 'port':" + port +
                ",'username:'" + username + '\'' +
                ", 'password':'" + password + "'\'}";
    }
}
