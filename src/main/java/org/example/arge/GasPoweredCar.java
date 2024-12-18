package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private int cylinders;
    private double avgKmPerLitre;

    public GasPoweredCar(String name, String description, int cylinders, double avgKmPerLitre) {
        super(name, description);
        this.cylinders = cylinders;
        this.avgKmPerLitre = avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + "'s Engine started to run. The total cylinder of this car is: " + cylinders);
        runEngine();
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is now driving the efficiency of these types of cars are: " + avgKmPerLitre + " KM/L");
    }
}
