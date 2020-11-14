package entity;

import car_action.CarActions;

public abstract class Car implements CarActions, Comparable<Car> {
    private String carBrand;
    private int cost;
    private double fuelConsumptionPer100km;
    private int maxSpeed;

    public Car(String carBrand, int cost, double fuelConsumptionPer100km, int maxSpeed){
        this.carBrand = carBrand;
        this.cost = cost;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.maxSpeed = maxSpeed;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public double getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    public void setFuelConsumptionPer100km(double fuelConsumptionPer100km) {
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Brand='" + carBrand + '\'' +
                ", Cost=" + cost +
                ", fuelConsumptionPer100km=" + fuelConsumptionPer100km +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        double compareConsumption = o.fuelConsumptionPer100km;
        return (int) (this.fuelConsumptionPer100km - compareConsumption);
    }
}
