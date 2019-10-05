package com.edgarturrin.design.patterns.abstract_factory.implementations;

import com.edgarturrin.design.patterns.abstract_factory.Connection;

public class ConnectionMongoDB implements Connection {

    private String host;
    private Integer port;
    private String username;
    private String password;

    public ConnectionMongoDB() {
        this.host = "host-mongodb";
        this.port = 6612;
        this.username = "username";
        this.password = "password";
    }

    @Override
    public void connect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Connected mongo DB "+this.toString());
    }

    @Override
    public void disconnect() {
        System.out.println(" - - - - - - - - - - - - - - - - - ");
        System.out.println("Disconnected mongoDB "+this.toString());
    }

    @Override
    public String toString() {
        return "connection_mongo_db:{" +
                "'host':" + host + '\'' +
                ", 'port':" + port +
                ",'username:'" + username + '\'' +
                ", 'password':'" + password + "'\'}";
    }
}
