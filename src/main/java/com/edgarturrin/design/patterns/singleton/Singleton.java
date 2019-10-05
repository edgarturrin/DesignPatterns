package com.edgarturrin.design.patterns.singleton;

public class Singleton {

    // Un atributo del mismo tipo que la clase singleton
    private static Singleton instance;

    // Constructor privado, para que solo llame dentro de la misma instancia
    private Singleton() {

    }

    // Metodo para obtener la referencia a la instancia
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    // Metodos de la clase
    @Override
    public String toString() {
        return "This is class singleton";
    }


}
