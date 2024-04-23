package daos;

import junit.framework.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void Car(){
        int expectedId = 1;
        String expectedMake = "Honda";
        String expectedModel = "Odysey";
        int expectedYear = 2019;
        String expectedColor = "Blue";
        int expectedVin = 215;
        Car car = new Car(expectedId, expectedMake, expectedModel, expectedYear, expectedColor, expectedVin );

       // Assert.assertEquals(expectedId, car.getId());
        Assert.assertEquals(expectedMake, car.getMake());
        Assert.assertEquals(expectedModel,car.getModel());
        Assert.assertEquals(expectedYear,car.getYear());
        Assert.assertEquals(expectedColor,car.getColor());
        Assert.assertEquals(expectedVin,car.getVin());

    }

    @Test
    public void setIdTest() {
        // given (1)
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);


        // when (2)
       Integer expected = 1;
        Integer actual = car.getId();

        // then (3)
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setMakeTest() {
        // given (1)
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);


                // when (2)
        String expected = "Honda";
        String actual = car.getMake();

        // then (3)
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void setModelTest() {
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);



        // when (2)
        String expected = "Odysey";
        String actual = car.getModel();

        // then (3)
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void setYearTest() {
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);



        // when (2)
        int expected = 2019;
        int actual = car.getYear();

        // then (3)
        Assert.assertEquals(expected, actual);
    }

    @Test

    public void setColorTest() {
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);



        // when (2)
        String expected = "Blue";
        String actual = car.getColor();

        // then (3)
        Assert.assertEquals(expected, actual);
    }

    public void setVinTest() {
        Car car = new Car(1, "Honda", "Odysey", 2019, "Blue", 215);



        // when (2)
       Integer expected = 215;
        Integer actual = car.getVin();

        // then (3)
        Assert.assertEquals(expected, actual);
    }
}




