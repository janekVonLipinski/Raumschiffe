package RaumschiffProjekt.TransportObjekte.konkreteLadungen;

import RaumschiffProjekt.TransportObjekte.Ladung;

public class Gast extends Ladung {

    private final String sprache;
    private final String heimatplanet;
    private final Verpflegungsart verpflegungsart;

    public Gast(String bezeichnung, int menge, String sprache,
                String heimatplanet, Verpflegungsart verpflegungsart) {
        super(bezeichnung, menge);
        this.sprache = sprache;
        this.heimatplanet = heimatplanet;
        this.verpflegungsart = verpflegungsart;
    }
}
