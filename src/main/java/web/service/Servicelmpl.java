package web.service;
import org.springframework.beans.factory.annotation.Autowired;
import web.Dao.CarDao;
import web.model.Car;
import java.util.List;


@org.springframework.stereotype.Service
public class Servicelmpl implements Service {
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCount(int count) {
        return carDao.getCount(count);
    }
}