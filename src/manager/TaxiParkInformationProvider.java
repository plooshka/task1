package manager;

import model.AbstractCar;

import java.util.List;

public interface TaxiParkInformationProvider {
    int calculateTotalCost(List<AbstractCar> abstractCars);
    List<AbstractCar> sortByConsumption(List<AbstractCar> abstractCars);
    List<AbstractCar> findTaxiBySpeed(int maxSpeed, int minSpeed, List<AbstractCar> abstractCars);
}
