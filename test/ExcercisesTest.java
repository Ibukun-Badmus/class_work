import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcercisesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test

    void canReturnFirstPowerOfThreeGreaterThanHundred() {
        int product = 3;
        while(product <= 100){
            product *= 3;
        }

        assertEquals(243, product);
    }
}