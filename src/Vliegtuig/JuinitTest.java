package Vliegtuig;
import Vliegtuig.Classes.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class JuinitTest {

    @Test
    public void toestemmingOpstijgen(){
        Luchthaven schiphol = new Luchthaven();

        assertFalse(schiphol.toestemmingOpstijgen(2500, 25, true));
        assertFalse(schiphol.toestemmingOpstijgen(2500, 55, false));
        assertFalse(schiphol.toestemmingOpstijgen(850, 25, false));

        assertTrue(schiphol.toestemmingOpstijgen(850, 25, true));
        assertTrue(schiphol.toestemmingOpstijgen(2500, 55, true));
        assertTrue(schiphol.toestemmingOpstijgen(850, 55, true));
    }

    @Test
    public void landindPrijsOBVGewicht() {
        Luchthaven schiphol = new Luchthaven();

        Vliegtuig v0 = new Vliegtuig(0, Landen.Anders, 0, false);
        Vliegtuig v1 = new Vliegtuig(500, Landen.Anders, 0, false);
        Vliegtuig v2 = new Vliegtuig(999, Landen.Anders, 0, false);
        Vliegtuig v3 = new Vliegtuig(1000, Landen.Anders, 0, false);
        Vliegtuig v4 = new Vliegtuig(1750, Landen.Anders, 0, false);
        Vliegtuig v5 = new Vliegtuig(4999, Landen.Anders, 0, false);
        Vliegtuig v6 = new Vliegtuig(5000, Landen.Anders, 0, false);
        Vliegtuig v7 = new Vliegtuig(5050, Landen.Anders, 0, false);

        assertEquals(100, schiphol.getPrijsBijLanden(v0), 0.001);
        assertEquals(100, schiphol.getPrijsBijLanden(v1), 0.001);
        assertEquals(100, schiphol.getPrijsBijLanden(v2), 0.001);
        assertEquals(500, schiphol.getPrijsBijLanden(v3), 0.001);
        assertEquals(500, schiphol.getPrijsBijLanden(v4), 0.001);
        assertEquals(500, schiphol.getPrijsBijLanden(v5), 0.001);
        assertEquals(2500, schiphol.getPrijsBijLanden(v6), 0.001);
        assertEquals(2500, schiphol.getPrijsBijLanden(v7), 0.001);
    }

    @Test
    public void getPrijs() {
        Luchthaven schiphol = new Luchthaven();

        Vliegtuig v0 = new Vliegtuig(500, Landen.Nederland, 1, true);
        Vliegtuig v1 = new Vliegtuig(500, Landen.Anders, 40, false);

        Vliegtuig v2 = new Vliegtuig(1050, Landen.Nederland, 1, true);
        Vliegtuig v3 = new Vliegtuig(1050, Landen.Anders, 50, false);

        Vliegtuig v4 = new Vliegtuig(6500, Landen.Nederland, 1, true);
        Vliegtuig v5 = new Vliegtuig(6500, Landen.Anders, 60, false);

        assertEquals(1089, schiphol.getPrijsBijLanden(v0), 0.001);
        assertEquals(150, schiphol.getPrijsBijLanden(v1), 0.001);

        assertEquals(1573, schiphol.getPrijsBijLanden(v2), 0.001);
        assertEquals(750, schiphol.getPrijsBijLanden(v3), 0.001);

        assertEquals(3993, schiphol.getPrijsBijLanden(v4), 0.001);
        assertEquals(3750, schiphol.getPrijsBijLanden(v5), 0.001);
    }
}

