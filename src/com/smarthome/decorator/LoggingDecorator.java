package com.smarthome.decorator;

import com.smarthome.composite.SmartDevice;

public class LoggingDecorator extends SmartDeviceDecorator {

    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        logAction("Turning on");
        super.turnOn();
    }

    @Override
    public void turnOff() {
        logAction("Turning off");
        super.turnOff();
    }

    private void logAction(String action) {
        System.out.println("[LOG] " + action + ": " + decoratedDevice.getClass().getSimpleName());
    }
}

