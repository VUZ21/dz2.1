package com.company;

public class Fruits {
    private Name name;
    private String type;
    private Colors color;


    public Fruits(Name name, String type, Colors color) {
        this.name = name;
        this.type = type;
        this.color = color;

    }

    public Name getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Colors getColor() {
        return color;
    }


}

