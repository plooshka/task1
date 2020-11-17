package model;

public class EconomCar extends AbstractCar {

    public EconomCar(String carBrand, int price, double fuelConsumptionPer100km, int maxSpeed) {
        super(carBrand, price, fuelConsumptionPer100km, maxSpeed);
    }

    @Override
    public void fill() {
        System.out.println("You have successfully refueled the diesel car.");
    }

    @Override
    public void drive() {
        System.out.println("We're going slowly, my legs are tight, but overall everything is fine.");
    }

}
