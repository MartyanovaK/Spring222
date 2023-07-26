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
    private static List<Car> cars = new ArrayList<Car>();

    static {
        cars.add(new Car(1, "BMW", "dgip"));
        cars.add(new Car(2, "Mersdes", "inomarka"));
        cars.add(new Car(3, "ford", "miniven"));
    }
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count") int allCars, Model model) {
        cars = Servicelmpl.getCount(cars, allCars);
        model.addAttribute("cars", cars);
        return "/cars";
    }
}