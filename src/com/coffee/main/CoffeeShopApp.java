package com.coffee.main;

import com.coffee.coffee.Coffee;
import com.coffee.coffee.CoffeeFactory;
import com.coffee.decorator.CaramelDecorator;
import com.coffee.decorator.ChocolateDecorator;
import com.coffee.decorator.MilkDecorator;

import java.util.Scanner;

public class CoffeeShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coffee Selection
        System.out.println("Welcome to Coffee Shop!");
        System.out.println("Available Coffee: Espresso, Latte, Cappuccino");
        System.out.print("Choose your coffee: ");
        String coffeeType = scanner.nextLine();

        try {
            Coffee coffee = CoffeeFactory.createCoffee(coffeeType);

            // Add Decorators
            System.out.println("Add-ons available: Milk ($1.5), Caramel ($2.0), Chocolate ($2.5)");
            System.out.print("Would you like Milk? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                coffee = new MilkDecorator(coffee);
            }

            System.out.print("Would you like Caramel? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                coffee = new CaramelDecorator(coffee);
            }

            System.out.print("Would you like Chocolate? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                coffee = new ChocolateDecorator(coffee);
            }

            // Display Final Order
            System.out.println("\nYour Order: " + coffee.getDescription());
            System.out.println("Total Cost: $" + coffee.getCost());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid coffee type. Please try again.");
        }

        scanner.close();
    }
}
