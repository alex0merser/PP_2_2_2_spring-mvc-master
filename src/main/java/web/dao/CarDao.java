package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;


import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDao {
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car(1, "Toyota Camry VIII", 249));
        cars.add(new Car(2, "Mitsubishi Eclipse Cross I", 150));
        cars.add(new Car(3, "Nissan Ariya I", 217));
        cars.add(new Car(4, "Lexus UX I", 178));
        cars.add(new Car(5, "Mazda CX-30 I", 150));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getFewCars(int count) {
        return cars.subList(0, count);
    }
}
