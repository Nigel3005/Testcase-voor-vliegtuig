package Vliegtuig;

public class vliegtuig {
    public boolean magOpstijgen(boolean toestemming, int tegenWind, int laadGewicht) {
        if(toestemming && (laadGewicht < 1000 || tegenWind > 50)) {
            return true;
        }else{
            return false;
        }
    }
    public double laadGewichtPrijs(int laadGewicht) {
        if(laadGewicht < 1000) {
            return 100;
        }else if(laadGewicht < 5000) {
            return 500;
        }else{
            return 2500;
        }
    }

    public double landPrijs(int laadGewicht,int passagiers, boolean bagageAfhandelen, boolean nederlandsVliegtuig) {
        double prijs = 0;

        if(laadGewicht < 1000) {
            prijs += 100;
        }else if(laadGewicht < 5000) {
            prijs += 500;
        }else{
            prijs += 2500;
        }
        if(passagiers == 2) {
            prijs *= 1.5;
        }

        if(bagageAfhandelen) {
            prijs += 800;
        }

        if(nederlandsVliegtuig) {
             prijs *= 1.21;
        }

        return prijs;
    }
}
