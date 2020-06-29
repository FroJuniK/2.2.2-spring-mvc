package hiber.service;

import hiber.dao.CarDao;
import hiber.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    @Autowired
    private CarDao dao;

    @Transactional
    @Override
    public void add(Car car) {
        dao.add(car);
    }

    @Transactional
    @Override
    public List<Car> listCars() {
        dao.add(new Car("brand1", "model1", "licensePlate1"));
        dao.add(new Car("brand2", "model2", "licensePlate2"));
        dao.add(new Car("brand3", "model3", "licensePlate3"));
        return dao.listCars();
    }
}
