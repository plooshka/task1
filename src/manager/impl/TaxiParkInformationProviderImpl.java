package manager.impl;

import manager.TaxiParkInformationProvider;
import model.AbstractCar;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiParkInformationProviderImpl implements TaxiParkInformationProvider {

    @Override
    public int calculateTotalCost(List<AbstractCar> abstractCars) {
        return abstractCars.stream().mapToInt(AbstractCar::getCost).sum();
    }

    @Override
    public List<AbstractCar> sortByConsumption(List<AbstractCar> abstractCars) {

        Collections.sort(abstractCars);
        return abstractCars;
    }

    @Override
    public List<AbstractCar> findTaxiBySpeed(int maxSpeed, int minSpeed, List<AbstractCar> abstractCars) {

          return abstractCars.stream()
                  .filter(s->minSpeed < s.getMaxSpeed() && s.getMaxSpeed() < maxSpeed)
                  .collect(Collectors.toList());
    }
}
