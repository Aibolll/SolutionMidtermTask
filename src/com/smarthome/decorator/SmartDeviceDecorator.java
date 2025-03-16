package com.smarthome.decorator;

import com.smarthome.composite.SmartDevice;

public abstract class SmartDeviceDecorator implements SmartDevice {
    protected SmartDevice decoratedDevice;

    public SmartDeviceDecorator(SmartDevice device) {
        this.decoratedDevice = device;
    }

    public void turnOn() { decoratedDevice.turnOn(); }
    public void turnOff() { decoratedDevice.turnOff(); }
}

