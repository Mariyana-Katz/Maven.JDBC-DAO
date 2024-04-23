package daos;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class CarDAOImplTest {

    @Test

    public void findByIdTest()throws SQLException {
        CarDAOImpl carDAO = new CarDAOImpl();
        int expected = 1;
        int actual = carDAO.findById(expected);
        Assert.assertEquals(expected, actual);

    }

    @Test

    public void findAllTest(){
        CarDAOImpl carDAO = new CarDAOImpl();
        List<DTO> cars = carDAO.findAll();
        for(DTO car: cars) {
        }
    }
}
