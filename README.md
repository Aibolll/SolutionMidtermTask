# Midterm Project - Java Design Patterns

## Overview
This project consists of three separate assignments implemented using Java:
1. **Smart Home Control System** - Implements composite, adapter, and facade design patterns.
2. **Online Payment Gateway** - Implements strategy and factory patterns for secure transactions.
3. **Coffee Shop Simulator** - Implements factory method and decorator patterns for customizable coffee orders.

Each system is structured into separate packages, ensuring modularity and maintainability.

---

## 1. Smart Home Control System
### Description
A system that controls various smart devices in a home, supporting grouped device control and legacy device adaptation.

### Features
- **Composite Pattern:** Groups multiple devices for collective control.
- **Adapter Pattern:** Integrates legacy smart home devices.
- **Facade Pattern:** Provides a centralized smart home controller.

### Project Structure
```
src/
│── com/smarthome/
│   ├── composite/  # Composite pattern implementation
│   │   ├── SmartDevice.java
│   │   ├── Light.java
│   │   ├── Thermostat.java
│   │   ├── DeviceGroup.java
│   ├── adapter/  # Adapter pattern for legacy devices
│   │   ├── LegacyDevice.java
│   │   ├── LegacyDeviceAdapter.java
│   ├── facade/  # Facade pattern for centralized control
│   │   ├── SmartHomeController.java
│   ├── main/  # Entry point
│   │   ├── SmartHomeSystem.java
```

### How to Run
Compile and run `SmartHomeSystem.java`. The program will demonstrate adding and controlling smart devices.

---


