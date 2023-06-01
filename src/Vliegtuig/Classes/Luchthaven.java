package Vliegtuig.Classes;

public class Luchthaven {
    public boolean toestemmingOpstijgen(int gewicht, int tegenWind, boolean toestemming) {
        if ((gewicht < 1000 || tegenWind > 50) && toestemming)
            return true;

        return false;
    }

    public double getPrijsBijLanden(Vliegtuig vliegtuig) {
        double totaalPrijs = 0;

        if (vliegtuig.getGewicht() < 1000)
            totaalPrijs += 100;
        else if (1000 <= vliegtuig.getGewicht() && vliegtuig.getGewicht() < 5000)
            totaalPrijs += 500;
        else
            totaalPrijs += 2500;

        if (vliegtuig.getPassagiers() > 2)
            totaalPrijs *= 1.5;

        if (vliegtuig.isBehandeldDoorLuchthaven())
            totaalPrijs += 800;

        if (vliegtuig.getLand() == Landen.Nederland)
            totaalPrijs *= 1.21;

        return totaalPrijs;
    }
}
