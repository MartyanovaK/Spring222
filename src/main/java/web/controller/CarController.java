package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.Servicelmpl;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    private Servicelmpl servicelmpl;
    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        if (count > 5 || count <= 0) {
            count = 5;
        }
        List<Car> cars = servicelmpl.getCount(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}