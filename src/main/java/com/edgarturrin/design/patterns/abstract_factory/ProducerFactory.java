package com.edgarturrin.design.patterns.abstract_factory;

import com.edgarturrin.design.patterns.abstract_factory.factory.ConnectionsSQLFactory;
import com.edgarturrin.design.patterns.abstract_factory.factory.ConnectionNotSQLFactory;

public abstract class ProducerFactory {

    public static Factory getFactory(String factory) {

        if (factory.equals("NO-SQL")){
            return new ConnectionNotSQLFactory();
        } else if (factory.equals("SQL")) {
            return new ConnectionsSQLFactory();
        } else {
            return null;
        }
    }
}
