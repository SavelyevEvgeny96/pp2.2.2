package web.service;

import web.classes.Car;

import java.util.List;

public interface CarService {

    List<Car> carsList();

    List<Car> getCarList(int forIndex, int toIndex);
}
