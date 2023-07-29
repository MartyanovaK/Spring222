package web.Dao;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {
    private List<Car> cars = new ArrayList<Car>();

    {
        cars.add(new Car(1, "BMW", "dgip"));
        cars.add(new Car(2, "Mersdes", "inomarka"));
        cars.add(new Car(3, "ford", "miniven"));
    }
    public List<Car> getCount(int count) {
        return cars.subList(0, count);
    }
}
