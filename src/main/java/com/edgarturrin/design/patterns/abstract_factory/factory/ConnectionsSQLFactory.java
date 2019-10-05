package com.edgarturrin.design.patterns.abstract_factory.factory;

import com.edgarturrin.design.patterns.abstract_factory.Connection;
import com.edgarturrin.design.patterns.abstract_factory.Factory;
import com.edgarturrin.design.patterns.abstract_factory.implementations.ConnectionEmpty;
import com.edgarturrin.design.patterns.abstract_factory.implementations.ConnectionMySQL;
import com.edgarturrin.design.patterns.abstract_factory.implementations.ConnectionOracle;

public class ConnectionsSQLFactory implements Factory {

    @Override
    public Connection getConnection(String motor) {

        if(motor.equals("MYSQL")){
            return new ConnectionMySQL();
        }else if (motor.equals("ORACLE")) {
            return new ConnectionOracle();
        } else {
            return new ConnectionEmpty();
        }

    }


}
