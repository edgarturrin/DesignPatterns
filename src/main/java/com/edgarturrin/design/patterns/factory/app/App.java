package com.edgarturrin.design.patterns.factory.app;

import com.edgarturrin.design.patterns.factory.Connection;
import com.edgarturrin.design.patterns.factory.ConnectionFactory;

public class App {

    public static void main(String[] args) {
        ConnectionFactory factory = new ConnectionFactory();

        Connection connection = factory.getConnection("MYSQL");
        connection.connect();
        connection.disconnect();

        connection = factory.getConnection("ORACLE");

        connection.connect();
        connection.disconnect();

    }
}
