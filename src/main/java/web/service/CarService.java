package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("Lexus IS 300", "Brown", 2003));
        cars.add(new Car("Mitsubishi Lancer EVOLUTION VIII", "White", 2004));
        cars.add(new Car("Aston Martin DB9", "Yellow", 2005));
        cars.add(new Car("Mazda RX-8", "Red", 2003));
        cars.add(new Car("Ford Mustang GT", "Silver", 2005));
    }

    public List<Car> getCars(int count) {
        if (count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
