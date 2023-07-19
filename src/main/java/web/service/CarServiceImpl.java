package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService{
    public final List<Car> carList;

    public CarServiceImpl() {

        carList = new ArrayList<>();
        carList.add(new Car("Volvo", "black", 2022, 250));
        carList.add(new Car("Toyota", "white", 2002, 190));
        carList.add(new Car("Lada", "green", 2016, 90));
        carList.add(new Car("Skoda", "brown", 1999, 140));
        carList.add(new Car("Nissan", "black", 2009, 320));
    }

    public List<Car> getAllCars() {
        return carList;
    }

    public List<Car> getCars(int count) {
        if (count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
