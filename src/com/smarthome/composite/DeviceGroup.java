package com.smarthome.composite;

import java.util.*;

public class DeviceGroup implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public DeviceGroup(String name) { this.name = name; }

    public void addDevice(SmartDevice device) { devices.add(device); }

    public void turnOn() {
        System.out.println("Turning on all devices in " + name);
        devices.forEach(SmartDevice::turnOn);
    }

    public void turnOff() {
        System.out.println("Turning off all devices in " + name);
        devices.forEach(SmartDevice::turnOff);
    }
}

