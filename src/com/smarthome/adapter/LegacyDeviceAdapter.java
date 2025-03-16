package com.smarthome.adapter;

import com.smarthome.composite.SmartDevice;

public class LegacyDeviceAdapter implements SmartDevice {
    private LegacyDevice legacyDevice;

    public LegacyDeviceAdapter(LegacyDevice legacyDevice) {
        this.legacyDevice = legacyDevice;
    }

    public void turnOn() {
        legacyDevice.activate();
    }

    public void turnOff() {
        legacyDevice.deactivate();
    }
}
