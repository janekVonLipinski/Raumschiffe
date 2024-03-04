package RaumschiffProjekt.TransportObjekte;

/**
 * eine Klasse die Ladung auf einem Raumschiff repräsentiert
 */
public abstract class Ladung {


    /**
     * bezeichnung - Bezeichnung der Ladung
     * menge - anzahl der Ladung
     */
    private String bezeichnung;
    private int menge;

    /**
     * erstellt eine Ladung mit den übergebenen Werten
     * @param bezeichnung - Bezeichnung der Ladung
     * @param menge - Anzahl der Ladung
     */
    public Ladung(String bezeichnung, int menge) {
        this.bezeichnung = bezeichnung;
        this.menge = menge;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getMenge() {
        return menge;
    }

    public void setMenge(int menge) {
        this.menge = menge;
    }

    @Override
    public String toString() {
        return "Ladung{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", menge=" + menge +
                '}';
    }
}
