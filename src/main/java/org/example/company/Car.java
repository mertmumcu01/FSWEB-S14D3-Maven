package org.example.company;

import java.util.Objects;

public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "CarSkeleton{name='" + name + "', cylinders=" + cylinders + ", engine=" + engine + ", wheels=" + wheels + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    public String startEngine(){
        return (getClass().getSimpleName() + " the car's engine is starting");
    }
    public String accelerate(){
        return (getClass().getSimpleName() + " the car is accelerating");
    }
    public String brake(){
        return (getClass().getSimpleName() + " the car is breaking");
    }
}
