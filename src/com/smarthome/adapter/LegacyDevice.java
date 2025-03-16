package com.smarthome.adapter;

public class LegacyDevice {
    private String name;

    public LegacyDevice(String name) {
        this.name = name;
    }

    public void activate() {
        System.out.println(name + " is activated (legacy system).");
    }

    public void deactivate() {
        System.out.println(name + " is deactivated (legacy system).");
    }
}

