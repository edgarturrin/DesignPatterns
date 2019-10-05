package com.edgarturrin.design.patterns.abstract_factory.implementations;

import com.edgarturrin.design.patterns.abstract_factory.Connection;

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
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Connected database mysql "+this.toString());
    }

    @Override
    public void disconnect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Disconnected database mysql "+this.toString());
    }

    @Override
    public String toString() {
        return "connection_mysql:{" +
                "'host':" + host + '\'' +
                ", 'port':" + port +
                ",'username:'" + username + '\'' +
                ", 'password':'" + password + "'\'}";
    }
}
