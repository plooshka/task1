package manager;

import entity.Car;

import java.util.List;

public interface TaxiPoolManager {
    public int calculateTotalCost(List<Car> cars);
    public List<Car> sortByConsumption(List<Car> cars);
    public List<Car> findTaxiBySpeed(int maxSpeed, int minSpeed, List<Car> cars);
}
