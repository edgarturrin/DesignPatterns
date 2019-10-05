package com.edgarturrin.design.patterns.abstract_factory.app;

import com.edgarturrin.design.patterns.abstract_factory.Connection;
import com.edgarturrin.design.patterns.abstract_factory.Factory;
import com.edgarturrin.design.patterns.abstract_factory.ProducerFactory;

public class App {

    public static void main(String[] args) {
        // instanciamos un factory del tipo no-sql
        Factory factory = ProducerFactory.getFactory("NO-SQL");

        // pedimos una conexion mongodb
        Connection connection = factory.getConnection("MONGODB");
        logInfo(connection);

        connection = factory.getConnection("CASSANDRA");
        logInfo(connection);

        connection = factory.getConnection("");
        logInfo(connection);

        factory = ProducerFactory.getFactory("SQL");

        connection = factory.getConnection("MYSQL");
        logInfo(connection);

        connection = factory.getConnection("ORACLE");
        logInfo(connection);

        connection = factory.getConnection("");
        logInfo(connection);


    }

    public static void logInfo(Connection connection){
        connection.connect();
        connection.disconnect();
    }
}
