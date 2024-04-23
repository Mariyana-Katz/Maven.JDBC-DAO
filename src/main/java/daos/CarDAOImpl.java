package daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDAOImpl implements DAO<Integer> {

    List<Car> cars = new ArrayList<Car>();
    public void CarDaoImpl(){
     // List<Car> cars = new ArrayList<Car>();
      Car car1 = new Car("Honda","Odysey", 2021, "Blue", 245);
        Car car2 = new Car("Honda","Accord", 2023, "Red", 312);
        cars.add(car1);
        cars.add(car2);
    }
    @Override
    public Integer findById(int id) {

        return id;
    }

    @Override
    public List findAll() {
        return cars;
    }

    @Override
    public Integer update(Integer dto) {
        return null;
    }

    @Override
    public Integer create(Integer dto) {
        return null;
    }


    @Override
    public void delete(int id) {
        cars.remove(cars);

    }
    private Car extractCarFromResultSet(ResultSet rs) throws SQLException {
       Car cars = new Car();

        cars.setId(rs.getInt("id"));
        cars.setMake(rs.getString("Make"));
        cars.setModel(rs.getString("Model"));
         cars.setYear(rs.getInt("Year"));
        cars.setColor(rs.getString("Color"));
        cars.setVin(rs.getInt("Vin"));

        return (Car) cars;
    }
}
