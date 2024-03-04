package RaumschiffProjekt.TransportObjekte.konkreteLadungen;

import RaumschiffProjekt.TransportObjekte.Ladung;

public class Transportgut extends Ladung {

    private final double laenge;
    private final double breite;
    private final double hoehe;

    public Transportgut(String bezeichnung, int menge, double laenge, double breite, double hoehe) {
        super(bezeichnung, menge);
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
}
