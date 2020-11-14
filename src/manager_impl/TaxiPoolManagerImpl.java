package manager_impl;

import entity.Car;
import manager.TaxiPoolManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaxiPoolManagerImpl implements TaxiPoolManager {
    @Override
    public int calculateTotalCost(List<Car> cars) {
        int totalCost = 0;
        for (Car x: cars
             ) {
            totalCost += x.getCost();
        }
        return totalCost;
    }

    @Override
    public List<Car> sortByConsumption(List<Car> cars) {
        Collections.sort(cars);
        return cars;
    }

    @Override
    public List<Car> findTaxiBySpeed(int maxSpeed, int minSpeed, List<Car> cars) {
        List<Car> carsInRange = new ArrayList<Car>();
        for (Car x: cars
             ) {
            if (minSpeed < x.getMaxSpeed() && x.getMaxSpeed() < maxSpeed) {
                carsInRange.add(x);
            }
        }
        return carsInRange;
    }
}
