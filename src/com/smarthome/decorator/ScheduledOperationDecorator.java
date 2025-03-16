package com.smarthome.decorator;

import com.smarthome.composite.SmartDevice;

public class ScheduledOperationDecorator extends SmartDeviceDecorator {
    private String schedule;

    public ScheduledOperationDecorator(SmartDevice device, String schedule) {
        super(device);
        this.schedule = schedule;
    }

    public void turnOn() {
        System.out.println("Scheduled to turn on at: " + schedule);
        decoratedDevice.turnOn();
    }

    public void turnOff() {
        System.out.println("Scheduled to turn off at: " + schedule);
        decoratedDevice.turnOff();
    }
}
