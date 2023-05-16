package Vliegtuig;
import org.junit.Test;
import static org.junit.Assert.*;

public class testVliegtuig {
    private vliegtuig vliegtuig = new vliegtuig();

    @Test
    public void testMagOpstijgen() {
        assertEquals(true, vliegtuig.magOpstijgen(true, 10, 500));
        assertEquals(false, vliegtuig.magOpstijgen(false, 10, 500));
        assertEquals(true, vliegtuig.magOpstijgen(true, 60, 500));
        assertEquals(false, vliegtuig.magOpstijgen(true, 10, 1500));
    }

    @Test
    public void testLaadGewichtPrijs() {
        assertEquals(100, vliegtuig.laadGewichtPrijs(500), 0.1);
        assertEquals(500, vliegtuig.laadGewichtPrijs(2000), 0.1);
        assertEquals(2500, vliegtuig.laadGewichtPrijs(10000), 0.1);
    }

    @Test
    public void testLandPrijs(){
        assertEquals(100, vliegtuig.landPrijs(500, 1, false, false), 0.1);
        assertEquals(150, vliegtuig.landPrijs(500, 2, false, false), 0.1);
        assertEquals(900, vliegtuig.landPrijs(500, 1, true, false), 0.1);
        assertEquals(950, vliegtuig.landPrijs(500, 2, true, false), 0.1);
        assertEquals(121, vliegtuig.landPrijs(500, 1, false, true), 0.1);
        assertEquals(181.5, vliegtuig.landPrijs(500, 2, false, true), 0.1);
    }
}
