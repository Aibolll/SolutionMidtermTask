package com.smarthome.factory;

import com.smarthome.composite.SmartDevice;

public interface SmartDeviceFactory {
    SmartDevice createLight(String name);
    SmartDevice createThermostat(String name);
}

