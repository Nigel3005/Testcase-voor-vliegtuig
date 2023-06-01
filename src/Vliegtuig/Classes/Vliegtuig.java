package Vliegtuig.Classes;

public class Vliegtuig {
    private int gewicht;
    private Landen land;
    private int passagiers;
    private boolean isBehandeldDoorLuchthaven;

    public Vliegtuig(int gewicht, Landen land, int passagiers, boolean isBehandeldDoorLuchthaven) {
        this.gewicht = gewicht;
        this.land = land;
        this.passagiers = passagiers;
        this.isBehandeldDoorLuchthaven = isBehandeldDoorLuchthaven;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public Landen getLand() {
        return land;
    }

    public void setLand(Landen land) {
        this.land = land;
    }

    public int getPassagiers() {
        return passagiers;
    }

    public void setPassagiers(int passagiers) {
        this.passagiers = passagiers;
    }

    public boolean isBehandeldDoorLuchthaven() {
        return isBehandeldDoorLuchthaven;
    }

    public void setbehandeldDoorLuchthaven(boolean isBehandeldDoorLuchthaven) {
        this.isBehandeldDoorLuchthaven = isBehandeldDoorLuchthaven;
    }
}
