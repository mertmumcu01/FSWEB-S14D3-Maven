package org.example.arge;

import org.example.company.Car;

import java.util.Objects;

public class CarSkeleton {

    private String name;
    private  String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    protected void runEngine() {
        System.out.println(name + " Engine is running");
    }

    public void drive() {
        System.out.println(name + " is driving");
    }

    public void startEngine() {
        System.out.println(name + " Engine is starting");
        runEngine();
    }
    public void printClassType() {
        System.out.println("This is a " + getClass().getSimpleName());
    }
}

