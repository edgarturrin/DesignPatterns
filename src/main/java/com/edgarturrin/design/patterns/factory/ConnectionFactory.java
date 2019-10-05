package com.edgarturrin.design.patterns.factory;

import com.edgarturrin.design.patterns.factory.implementations.ConnectionEmpty;
import com.edgarturrin.design.patterns.factory.implementations.ConnectionMySQL;
import com.edgarturrin.design.patterns.factory.implementations.ConnectionOracle;

public class ConnectionFactory {

    public Connection getConnection(String motor){

        if(motor.equals("MYSQL")){
            return new ConnectionMySQL();
        }else if (motor.equals("ORACLE")) {
            return new ConnectionOracle();
        } else {
            return new ConnectionEmpty();
        }
    }

}
