package com.edgarturrin.design.patterns.abstract_factory.factory;

import com.edgarturrin.design.patterns.abstract_factory.Connection;
import com.edgarturrin.design.patterns.abstract_factory.Factory;
import com.edgarturrin.design.patterns.abstract_factory.implementations.*;

public class ConnectionNotSQLFactory implements Factory {

    @Override
    public Connection getConnection(String motor) {

        if(motor.equals("MONGODB")){
            return new ConnectionMongoDB();
        }else if (motor.equals("CASSANDRA")) {
            return new ConnectionCassandra();
        } else {
            return new ConnectionEmpty();
        }

    }

}
