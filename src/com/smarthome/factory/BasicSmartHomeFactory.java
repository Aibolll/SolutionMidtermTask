package com.smarthome.factory;

import com.smarthome.composite.Light;
import com.smarthome.composite.SmartDevice;
import com.smarthome.composite.Thermostat;

public class BasicSmartHomeFactory implements SmartDeviceFactory {
    public SmartDevice createLight(String name) {
        return new Light(name);
    }

    public SmartDevice createThermostat(String name) {
        return new Thermostat(name);
    }
}
