import model.AbstractCar;
import model.EconomCar;
import model.PremiumCar;
import model.StandardCar;
import manager.impl.TaxiParkInformationProviderImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        TaxiParkInformationProviderImpl taxiPoolManager = new TaxiParkInformationProviderImpl();
        List<AbstractCar> abstractCars = new ArrayList<>();
        abstractCars.add(new StandardCar("Toyta", 15000, 10, 110));
        abstractCars.add(new PremiumCar("BMW", 25000, 12, 140));
        abstractCars.add(new EconomCar("LADA", 5000, 7, 90));
        abstractCars.add(new EconomCar("Mercedes", 32500, 13, 154));
        abstractCars.add(new PremiumCar("Lexus", 74650, 18, 190));

        System.out.println(taxiPoolManager.calculateTotalCost(abstractCars));
        System.out.println(taxiPoolManager.sortByConsumption(abstractCars).toString());
        System.out.println(taxiPoolManager.findTaxiBySpeed(150, 60, abstractCars).toString());
    }
}
