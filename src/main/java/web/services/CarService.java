package web.services;

import web.models.Car;

import java.util.List;

public interface CarService {

    List<Car> carsList(int count);

    List<Car> carsList();
}
