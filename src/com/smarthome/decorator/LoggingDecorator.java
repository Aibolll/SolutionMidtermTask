package com.smarthome.decorator;

import com.smarthome.composite.SmartDevice;

public class LoggingDecorator extends SmartDeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    public void turnOn() {
        System.out.println("[LOG] Turning on: " + decoratedDevice.getClass().getSimpleName());
        decoratedDevice.turnOn();
    }

    public void turnOff() {
        System.out.println("[LOG] Turning off: " + decoratedDevice.getClass().getSimpleName());
        decoratedDevice.turnOff();
    }
}

