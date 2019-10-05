package com.edgarturrin.design.patterns.abstract_factory.implementations;

import com.edgarturrin.design.patterns.abstract_factory.Connection;

public class ConnectionCassandra implements Connection {
    private String host;
    private Integer port;
    private String username;
    private String password;

    public ConnectionCassandra() {
        this.host = "host-cassandra";
        this.port = 6612;
        this.username = "username";
        this.password = "password";
    }

    @Override
    public void connect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Connected cassandra "+this.toString());
    }

    @Override
    public void disconnect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Disconnected cassandra "+this.toString());
    }

    @Override
    public String toString() {
        return "connection_cassandra:{" +
                "'host':" + host + '\'' +
                ", 'port':" + port +
                ",'username:'" + username + '\'' +
                ", 'password':'" + password + "'\'}";
    }
}
