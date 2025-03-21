# Midterm Project - Java Design Patterns

## Overview
This project consists of three separate assignments implemented using Java:
1. **Smart Home Control System** - Implements composite, adapter, decorator, factory and facade design patterns.
2. **Online Payment Gateway** - Implements adapter and factory patterns for secure transactions.
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

## 2. Online Payment Gateway
### Description
A secure payment gateway supporting different payment methods using the strategy pattern.

### Features
- **Strategy Pattern:** Supports multiple payment methods dynamically.
- **Factory Pattern:** Creates different payment processors.
- **Secure Transaction Handling:** Ensures safe payments.

### Project Structure
```
src/
│── com/paymentgateway/
│   ├── strategy/  # Strategy pattern implementation
│   │   ├── PaymentStrategy.java
│   │   ├── CreditCardPayment.java
│   │   ├── PayPalPayment.java
│   │   ├── CryptocurrencyPayment.java
│   ├── factory/  # Factory pattern for payment processors
│   │   ├── PaymentProcessorFactory.java
│   ├── main/  # Entry point
│   │   ├── PaymentGatewayApp.java
```

### How to Run
Compile and run `PaymentGatewayApp.java`. Choose a payment method and complete a transaction.

---

## 3. Coffee Shop Simulator
### Description
A customizable coffee ordering system where users can select coffee types and add toppings.

### Features
- **Factory Method Pattern:** Creates coffee objects dynamically.
- **Decorator Pattern:** Allows adding multiple toppings dynamically.

### Project Structure
```
src/
│── com/coffee/
│   ├── coffee/  # Factory method for coffee types
│   │   ├── Coffee.java
│   │   ├── Espresso.java
│   │   ├── Latte.java
│   │   ├── Cappuccino.java
│   │   ├── CoffeeFactory.java
│   ├── decorator/  # Decorator pattern for add-ons
│   │   ├── CoffeeDecorator.java
│   │   ├── MilkDecorator.java
│   │   ├── CaramelDecorator.java
│   │   ├── ChocolateDecorator.java
│   ├── main/  # Entry point
│   │   ├── CoffeeShopApp.java
```

### How to Run
Compile and run `CoffeeShopApp.java`. Select a coffee type and choose toppings to customize your order.

---




