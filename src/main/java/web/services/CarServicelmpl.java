package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.models.Car;

import java.util.List;

@Service
public class CarServicelmpl implements CarService{

    private final CarDao carDao;

    @Autowired
    public CarServicelmpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> carsList(int count) {
        if (count > 5) {
            return carDao.getCars();
        } else {
            return carDao.getFewCars(count);
        }
    }

    @Override
    public List<Car> carsList() {
        return carDao.getCars();
    }


}
