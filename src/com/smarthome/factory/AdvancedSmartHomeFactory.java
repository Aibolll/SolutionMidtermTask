package com.smarthome.factory;

import com.smarthome.composite.Light;
import com.smarthome.composite.SmartDevice;
import com.smarthome.composite.Thermostat;
import com.smarthome.decorator.LoggingDecorator;

public class AdvancedSmartHomeFactory implements SmartDeviceFactory {
    public SmartDevice createLight(String name) {
        return new LoggingDecorator(new Light(name));
    }

    public SmartDevice createThermostat(String name) {
        return new LoggingDecorator(new Thermostat(name));
    }
}

