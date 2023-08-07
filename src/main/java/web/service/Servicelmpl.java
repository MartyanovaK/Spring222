package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class Servicelmpl implements ServiceCar {
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCount(int count) {
        return carDao.getCount(count);
    }
}