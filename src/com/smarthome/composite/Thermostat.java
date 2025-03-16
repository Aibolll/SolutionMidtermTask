package com.smarthome.composite;

public class Thermostat implements SmartDevice {
    private String name;
    private int temperature;
    public Thermostat(String name) { this.name = name; }
    public void turnOn() { System.out.println(name + " is heating up."); }
    public void turnOff() { System.out.println(name + " is cooling down."); }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " set to " + temperature + "°C.");
    }
}

