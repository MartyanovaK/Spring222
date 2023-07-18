package web.service;


import web.model.Car;


import java.util.List;
import java.util.stream.Collectors;

public class Servicelmpl implements Service {

    public static List<Car> getCount(List<Car> cars, int number) {
        if (number == 0 || number > 5) return cars;
        return cars.stream().limit(number).collect(Collectors.toList());
    }
}