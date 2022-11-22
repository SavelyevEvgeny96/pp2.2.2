package web.service;


import org.springframework.stereotype.Service;
import web.classes.Car;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();

    @Override
    public List<Car> carsList() {

        cars.add(new Car("Citroen", "c4", 2007));
        cars.add(new Car("LADA", "Largus", 2010));
        cars.add(new Car("UAZ", "Patriot", 3163));
        cars.add(new Car("Audi", "A6", 1999));
        cars.add(new Car("Mitsubishi", "Charisma", 2002));
        cars.add(new Car("Mercedes", "ML", 2022));
        cars.add(new Car("Nissan", "GTR", 2011));

        return cars;

    }
@Override
    public List<Car> getCarList(int fromIndex, int toIndex) {
        return cars.subList(fromIndex, toIndex);

    }

}