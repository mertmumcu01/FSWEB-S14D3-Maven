package org.example.arge;

public class ElectricCar extends CarSkeleton{

    private double avgKmPerCharge;
    private  int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "'s Engine started to run. The total batterySize of this car is: " + batterySize);
        runEngine();
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is now driving the efficiency of these types of cars are: " + avgKmPerCharge + " KM/L");
    }
}
