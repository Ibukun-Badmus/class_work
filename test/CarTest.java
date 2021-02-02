import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;



    @BeforeEach
    void setUp() {

    car = new Car();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void car_CanBeCreatedWithoutEngine(){
    car = new Car();
    assertNotNull(car.getEngine());
    }

    @Test
    void car_CanBeCreatedWithEngine(){
        Engine engine = new Engine();
        car = new Car(engine);
        assertNotNull(car.getEngine());
    }
}
