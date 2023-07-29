package web.Dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CarDao {
    private List<Car> cars = new ArrayList<Car>(Arrays.asList(new Car(1, "BMW", "dgip"),
            new Car(2, "Mersdes", "inomarka"),
            new Car(3, "ford", "miniven")));
    public List<Car> getCount(int count) {
        return cars.subList(0, count);
    }
}
