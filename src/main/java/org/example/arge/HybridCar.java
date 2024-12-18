package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "'s Engine started to run. The total batterySize of this car is: " + batterySize);
        runEngine();
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is now driving the efficiency of these types of cars are: " + avgKmPerLiter + " KM/L");
    }

}
