package web.service;

import web.classes.Car;

import java.util.List;

public interface CarService {


    List<Car> getCarList(int count, List<Car> fullList);

    List<Car> getResultList();
}
