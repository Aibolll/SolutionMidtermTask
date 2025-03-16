package com.coffee.coffee;

public class CoffeeFactory {
    public static Coffee createCoffee(String type) {
        return switch (type.toLowerCase()) {
            case "espresso" -> new Espresso();
            case "latte" -> new Latte();
            case "cappuccino" -> new Cappuccino();
            default -> throw new IllegalArgumentException("Invalid coffee type");
        };
    }
}
