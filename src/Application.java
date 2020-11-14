import entity.Car;
import entity.EconomCarTaxi;
import entity.PremiumCarTaxi;
import entity.StandardCarTaxi;
import manager_impl.TaxiPoolManagerImpl;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        TaxiPoolManagerImpl taxiPoolManager = new TaxiPoolManagerImpl();
        List<Car> cars = new ArrayList<>();
        cars.add(new StandardCarTaxi("Toyta", 15000, 10, 110));
        cars.add(new PremiumCarTaxi("BMW", 25000, 12, 140));
        cars.add(new EconomCarTaxi("LADA", 5000, 7, 90));
        cars.add(new EconomCarTaxi("Mercedes", 32500, 13, 154));
        cars.add(new PremiumCarTaxi("Lexus", 74650, 18, 190));

        System.out.println(taxiPoolManager.calculateTotalCost(cars));
        System.out.println(taxiPoolManager.sortByConsumption(cars).toString());
        System.out.println(taxiPoolManager.findTaxiBySpeed(200, 160, cars).toString());
    }
}
