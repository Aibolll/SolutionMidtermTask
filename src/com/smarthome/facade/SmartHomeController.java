// Package: com.smarthome.facade
package com.smarthome.facade;

import com.smarthome.composite.*;
import com.smarthome.adapter.*;
import java.util.*;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        devices.forEach(SmartDevice::turnOn);
    }

    public void turnAllOff() {
        devices.forEach(SmartDevice::turnOff);
    }

    public void turnAllLightsOn() {
        devices.stream()
                .filter(d -> d instanceof Light)
                .forEach(SmartDevice::turnOn);
    }

    public void setGlobalTemperature(int temperature) {
        devices.stream()
                .filter(d -> d instanceof Thermostat)
                .map(d -> (Thermostat) d) // Ensure proper casting
                .forEach(t -> t.setTemperature(temperature));
    }

    public void lockAllDoors() {
        devices.stream()
                .filter(d -> d instanceof LegacyDeviceAdapter)
                .forEach(SmartDevice::turnOn);
    }
}
