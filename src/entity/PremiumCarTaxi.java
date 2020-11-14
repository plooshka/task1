package entity;

public class PremiumCarTaxi extends Car {
    public PremiumCarTaxi(String carBrand, int price, double fuelConsumptionPer100km, int maxSpeed) {
        super(carBrand, price, fuelConsumptionPer100km, maxSpeed);
    }

    @Override
    public void fill() {
        System.out.println("Refuel with 95 petrol.");
    }

    @Override
    public void drive() {
        System.out.println("We go quickly with a glass of champagne.");
    }
}
