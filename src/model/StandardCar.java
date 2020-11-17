package model;

public class StandardCar extends AbstractCar {
    public StandardCar(String carBrand, int price, double fuelConsumptionPer100km, int maxSpeed) {
        super(carBrand, price, fuelConsumptionPer100km, maxSpeed);
    }

    @Override
    public void fill() {
        System.out.println("You filled the car with 92 gas.");
    }

    @Override
    public void drive() {
        System.out.println("It's warm in the car, we'll be there soon.");
    }
}
