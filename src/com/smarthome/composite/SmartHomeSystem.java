package com.smarthome.composite;

import com.smarthome.facade.*;
import com.smarthome.adapter.*;
import com.smarthome.factory.*;

public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create factories
        SmartDeviceFactory basicFactory = new BasicSmartHomeFactory();
        SmartDeviceFactory advancedFactory = new AdvancedSmartHomeFactory();

        // Create smart devices using factories
        SmartDevice livingRoomLight = basicFactory.createLight("Living Room Light");
        SmartDevice homeThermostat = advancedFactory.createThermostat("Home Thermostat");

        // Adapt legacy device to smart home system
        LegacyDevice legacyLock = new LegacyDevice("Old Door Lock");
        SmartDevice adaptedLock = new LegacyDeviceAdapter(legacyLock);

        // Create a device group
        DeviceGroup livingRoom = new DeviceGroup("Living Room");
        livingRoom.addDevice(livingRoomLight);

        // Create a smart home controller (Facade)
        SmartHomeController controller = new SmartHomeController();
        controller.addDevice(livingRoom);
        controller.addDevice(homeThermostat);
        controller.addDevice(adaptedLock);

        // Test functionalities
        System.out.println("\n--- Turning all devices ON ---");
        controller.turnAllOn();

        System.out.println("\n--- Turning all devices OFF ---");
        controller.turnAllOff();

        System.out.println("\n--- Turning only lights ON ---");
        controller.turnAllLightsOn();

        System.out.println("\n--- Setting global temperature to 22°C ---");
        controller.setGlobalTemperature(22);

        System.out.println("\n--- Locking all doors ---");
        controller.lockAllDoors();
    }
}

