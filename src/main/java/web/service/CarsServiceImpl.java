package web.service;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import web.classes.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarsServiceImpl implements CarService {
    private final List<Car> resultList = new ArrayList<>();


    {
        resultList.add(new Car("Citroen", "c4", 2007));
        resultList.add(new Car("LADA", "Largus", 2010));
        resultList.add(new Car("UAZ", "Patriot", 3163));
        resultList.add(new Car("Audi", "A6", 1999));
        resultList.add(new Car("Mitsubishi", "Charisma", 2002));
        resultList.add(new Car("Mercedes", "ML", 2022));
        resultList.add(new Car("Nissan", "GTR", 2011));

    }

    public List<Car> getResultList() {
        return resultList;
    }

    @Override
    public List<Car> getCarList(int count, List<Car> fullList) {
        if (count >= 5) {
            return resultList;
        }
        return fullList.subList(0, count);
    }

}