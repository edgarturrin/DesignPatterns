package com.edgarturrin.design.patterns.builder;

public final class People {

    private String name;

    public String getName(){
        return this.name;
    }

    public People(final Builder builder){
        name = builder.name;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder{

        private String name;

        private Builder(){

        }
        public Builder name(String name){
            this.name = name;
            return this;
        }

        public People build(){
            return new People(this);
        }
    }
}
