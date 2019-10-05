package com.edgarturrin.design.patterns.abstract_factory.implementations;

import com.edgarturrin.design.patterns.abstract_factory.Connection;

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
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Connected database empty "+this.toString());
    }

    @Override
    public void disconnect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Disconnected database empty "+this.toString());
    }


    @Override
    public String toString() {
        return "connection_empty:{" +
                "'host':" + host + '\'' +
                ", 'port':" + port +
                ",'username:'" + username + '\'' +
                ", 'password':'" + password + "'\'}";
    }
}
