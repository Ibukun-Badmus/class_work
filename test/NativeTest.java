import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void nativeTest(){
        Native wimp = new Native();
        wimp.setStudentID("SCV5018");
        wimp.setFirstName("Barnabas");
        wimp.setSurname("Oretan");
        wimp.setDatabaseGrade(2);
        wimp.setDesignThinkingGrade(1);
        wimp.setJavaGrade(5);

        Native wimpDozie = new Native ("SCV5008", "Dozie", "Uyawune");
        wimpDozie.setDatabaseGrade(20);
        wimpDozie.setDesignThinkingGrade(15);
        wimp.setJavaGrade(3);

        int[] wimpScores = {75, 90, 78};
        Native Onyi = new Native("SCV001", "Onyi", "Agbo", wimpScores);
        assertEquals(75, Onyi.getJavaGrade());
    }

    @Test
    void exerciseTest(){
        int[] f = {2, 3, 6, 8, 1, 4, 9};
        assertEquals(4, f[5]);

        int[] g = {8, 8, 8, 8, 8};

        float total = 0;
        float[] c = new float[100];
        for(int i = 0; i < c.length; i++){
            c[i] = i;

            total = total + c[i];
        }

        assertEquals(4950.0, total);
        System.out.println("Total is " + total);
    }

    @Test
    void salesCommissionTest() {
    int [] salesAmounts = {4000, 24000, 500000, 10000, 100000};
    int[] frequency = new int[9];
    }
    }

