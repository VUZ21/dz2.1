package com.company;

public class Strawberry extends Fruits {
    public Strawberry (Name name, String type, Colors color) {
        super(name, type, color);
    }

    public String getInfo() {
        return "Полезные свойства: " + getType() + ", цвет: " + getColor() +
                ", название: "  +getName().getName() + ", " + getName().getStructure();

    }

    public final void makeGift (String giftName, int structure) {
        for (int i = 0; i < 4; i++) {
            System.out.println(giftName);
        }
    }

    public void makeGift(int structure) {
        for (int i = 0; i < structure; i++) {
            System.out.println(structure);
        }
    }
}

