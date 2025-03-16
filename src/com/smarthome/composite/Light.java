package com.smarthome.composite;

public class Light implements SmartDevice {
    private String name;
    public Light(String name) { this.name = name; }
    public void turnOn() { System.out.println(name + " is turned on."); }
    public void turnOff() { System.out.println(name + " is turned off."); }
}
