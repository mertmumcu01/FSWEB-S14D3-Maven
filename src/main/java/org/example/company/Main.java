package org.example.company;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {

        CarSkeleton gasCar = new GasPoweredCar("Ford Mustang", "High-performance gas car", 12, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model S", "Luxury electric car", 400.0, 100);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Fuel-efficient hybrid car", 25.0, 20, 4);

        // Her sınıfın davranışını test ediyoruz
        gasCar.printClassType();
        gasCar.startEngine();
        gasCar.drive();

        System.out.println("-------------------------");

        electricCar.printClassType();
        electricCar.startEngine();
        electricCar.drive();

        System.out.println("-------------------------");

        hybridCar.printClassType();
        hybridCar.startEngine();
        hybridCar.drive();
    }
}