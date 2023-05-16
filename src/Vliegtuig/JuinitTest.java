package Vliegtuig;

import org.junit.Test;
import static org.junit.Assert.*;

public class JuinitTest {
    private vliegtuig vliegtuig = new vliegtuig();

    @Test
    public void testLaadGewichtPrijs() {
        assertEquals(100, vliegtuig.laadGewichtPrijs(999), 0.1); //Equivalentieklasse 1
        assertEquals(500, vliegtuig.laadGewichtPrijs(1000), 0.1); //Equivalentieklasse 2
        assertEquals(2500, vliegtuig.laadGewichtPrijs(5000), 0.1); //Equivalentieklasse 3

        assertEquals(100, vliegtuig.laadGewichtPrijs(499), 0.1); //Equivalentieklasse 4
        assertEquals(500, vliegtuig.laadGewichtPrijs(1299), 0.1); //Equivalentieklasse 5
        assertEquals(2500, vliegtuig.laadGewichtPrijs(5999), 0.1); //Equivalentieklasse 6

        assertEquals(100, vliegtuig.laadGewichtPrijs(888), 0.1); //Equivalentieklasse 7
        assertEquals(500, vliegtuig.laadGewichtPrijs(1200), 0.1); //Equivalentieklasse 8
        assertEquals(2500, vliegtuig.laadGewichtPrijs(10000), 0.1); //Equivalentieklasse 9
    }

    @Test
    public void testToestemming(){
        assertEquals(vliegtuig.magOpstijgen(true, 10, 1000), false); //Equivalentieklasse 1
        assertEquals(vliegtuig.magOpstijgen(true, 25, 999), true); //Equivalentieklasse 2
        assertEquals(vliegtuig.magOpstijgen(true, 81, 1000), true); //Equivalentieklasse 3
        assertEquals(vliegtuig.magOpstijgen(true, 75, 999), true); //Equivalentieklasse 4
        assertEquals(vliegtuig.magOpstijgen(false, 20, 1000), false); //Equivalentieklasse 5
        assertEquals(vliegtuig.magOpstijgen(false, 18, 999), false); //Equivalentieklasse 6
        assertEquals(vliegtuig.magOpstijgen(false, 54, 1000), false); //Equivalentieklasse 7
        assertEquals(vliegtuig.magOpstijgen(false, 90, 999), false); //Equivalentieklasse 8
        assertEquals(vliegtuig.magOpstijgen(true, 60, 1000), true); //Equivalentieklasse 9
    }

    @Test
    public void TestAll(){
        assertEquals(1149.5, vliegtuig.landPrijs(999, 2, true, true), 0.01); //Equivalentieklasse 1
        assertEquals(1550.0, vliegtuig.landPrijs(1001, 2, true, false), 0.01); //Equivalentieklasse 2
        assertEquals(907.5, vliegtuig.landPrijs(2000, 2, false, true), 0.01); //Equivalentieklasse 3
        assertEquals(750.0, vliegtuig.landPrijs(3000, 2, false, false), 0.01); //Equivalentieklasse 4
        assertEquals(1573.0, vliegtuig.landPrijs(4000, 1, true, true), 0.01); //Equivalentieklasse 5
        assertEquals(3300.0, vliegtuig.landPrijs(5000, 1, true, false), 0.01); //Equivalentieklasse 6
        assertEquals(3025.0, vliegtuig.landPrijs(6000, 1, false, true), 0.01); //Equivalentieklasse 7
        assertEquals(2500.0, vliegtuig.landPrijs(7000, 1, false, false), 0.01); //Equivalentieklasse 8
    }

    @Test
    public void testGetDecision() {
        // Testcase 1
        boolean result1 = getDecision(true, true, true);
        assertTrue(result1);

        // Testcase 2
        boolean result2 = getDecision(true, true, false);
        assertTrue(result2);

        // Testcase 3
        boolean result3 = getDecision(true, false, true);
        assertTrue(result3);

        // Testcase 4
        boolean result4 = getDecision(true, false, false);
        assertFalse(result4);

        // Testcase 5
        boolean result5 = getDecision(false, true, true);
        assertFalse(result5);

        // Testcase 6
        boolean result6 = getDecision(false, true, false);
        assertFalse(result6);

        // Testcase 7
        boolean result7 = getDecision(false, false, true);
        assertFalse(result7);

        // Testcase 8
        boolean result8 = getDecision(false, false, false);
        assertFalse(result8);
    }

    private boolean getDecision(boolean conditionA, boolean conditionB, boolean conditionC) {
        // Implementeer hier de logica om de waarde van D = <Decision> te bepalen
        // Gebaseerd op de waarden van conditionA, conditionB en conditionC

        boolean decision;

        decision = conditionA && (conditionB || conditionC);

        // Return de waarde van D
        return decision;
    }
}

