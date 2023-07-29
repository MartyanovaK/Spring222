package web.service;

import web.Dao.CarDao;
import web.model.Car;
import java.util.List;

public interface Service {
    public List<Car> getCount(int count);
}