package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Servicelmpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private static int CARS_COUNT;
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT, "BMW", "dgip"));
        cars.add(new Car(++CARS_COUNT, "Mersdes", "inomarka"));
        cars.add(new Car(++CARS_COUNT, "ford", "miniven"));
        cars = Servicelmpl.getCount(cars, allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}