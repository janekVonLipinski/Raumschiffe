package RaumschiffProjekt.Schiff;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Raumschiff {

    private int energieversorgungInProzent;
    private int schildeInProzent;
    private int huelleInProzent;
    private int lebenserhaltungssystemeInProzent;
    private int anzahlPhotonenTorpedos;
    private int androidenAnzahl;
    private String schiffsname;
    private final List<Ladung> ladungsVerzeichnis;
    private static final ArrayList<String> broadcastKommunikator = new ArrayList<>();
    private static final int SCHADEN_BEI_TREFFER = 50;
    private static final int ENERGIEVERBRAUCH_BEI_SCHUSS = 50;

    /**
     * erstellt ein Raumschiff mit den übergebenen Parametern
     * @param energieversorgungInProzent - Die Energieversorgung in Prozent
     * @param schildeInProzent - Der Schild in Prozent
     * @param huelleInProzent - Die Huelle in Prozent
     * @param lebenserhaltungssystemeInProzent - Die Lebenserhaltungssysteme, sind diese auf 0 ist das Schiff tot
     * @param anzahlPhotonenTorpedos - Anzahl der PhotonenTorpedos
     * @param androidenAnzahl - Anzahl der Androiden
     * @param schiffsname - Name des Schiffs
     */
    public Raumschiff(int energieversorgungInProzent, int schildeInProzent,
                      int huelleInProzent, int lebenserhaltungssystemeInProzent,
                      int anzahlPhotonenTorpedos, int androidenAnzahl, String schiffsname) {
        this.energieversorgungInProzent = energieversorgungInProzent;
        this.schildeInProzent = schildeInProzent;
        this.huelleInProzent = huelleInProzent;
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
        this.anzahlPhotonenTorpedos = anzahlPhotonenTorpedos;
        this.androidenAnzahl = androidenAnzahl;
        this.schiffsname = schiffsname;
        this.ladungsVerzeichnis = new ArrayList<>();
    }

    /**
     * gibt energieVersorgung in Prozent zurück
     * @return energieVersorgungInProzent
     */
    public int getEnergieversorgungInProzent() {
        return energieversorgungInProzent;
    }

    /**
     * setzt die Energieversorgung auf den übergebenen Wert. Kann nicht über 100 und unter 0 gesetzt werden
     * @param energieversorgungInProzent - Wert auf den EnergieVersorgungInProzent gesetzt werden soll
     */
    public void setEnergieversorgungInProzent(int energieversorgungInProzent) {
        this.energieversorgungInProzent = (energieversorgungInProzent >= 0 && energieversorgungInProzent <= 100)
                ? energieversorgungInProzent : (energieversorgungInProzent > 100) ? 100 : 0;
    }

    /**
     * gibt SchildeInProzent zurueck
     * @return schildeInProzent
     */
    public int getSchildeInProzent() {
        return schildeInProzent;
    }

    /**
     * setzt die schildeInProzent auf den übergebenen Wert. Kann nicht über 100 und unter 0 gesetzt werden
     * @param schildeInProzent - Wert auf den schildeInProzent gesetzt werden soll
     */
    public void setSchildeInProzent(int schildeInProzent) {
        this.schildeInProzent = (schildeInProzent >= 0 && schildeInProzent <= 100)
                ? schildeInProzent : (schildeInProzent > 100) ? 100 : 0;
    }

    /**
     * gibt Huelle in Prozent zurueck
     * @return huelleInProzent
     */
    public int getHuelleInProzent() {
        return huelleInProzent;
    }

    /**
     * setzt die huelleInProzent auf den übergebenen Wert. Kann nicht über 100 und unter 0 gesetzt werden
     * @param huelleInProzent - Wert auf den huelleInProzent gesetzt werden soll
     */
    public void setHuelleInProzent(int huelleInProzent) {
        this.huelleInProzent = (huelleInProzent >= 0 && huelleInProzent <= 100)
                ? huelleInProzent : (huelleInProzent > 100) ? 100 : 0 ;
    }

    /**
     * gibt die lebensErhaltungssystemeInProzent zurück
     * @return lebenserhaltungssystemInProzent
     */
    public int getLebenserhaltungssystemeInProzent() {
        return lebenserhaltungssystemeInProzent;
    }

    /**
     * setzt lebenserhaltungssystemeInProzent auf den übergebenen Wert
     * @param lebenserhaltungssystemeInProzent - wert auf den gesetzt werden soll
     */
    public void setLebenserhaltungssystemeInProzent(int lebenserhaltungssystemeInProzent) {
        this.lebenserhaltungssystemeInProzent = lebenserhaltungssystemeInProzent;
    }

    /**
     * gibt die Anzahl der Photonentorpedos zurück
     * @return anzahlPhotonenTorpedos
     */
    public int getAnzahlPhotonenTorpedos() {
        return anzahlPhotonenTorpedos;
    }

    /**
     * setzt Anzahl der Photonentorpedos auf übergebenen Wert
     * @param anzahlPhotonenTorpedos
     */
    public void setAnzahlPhotonenTorpedos(int anzahlPhotonenTorpedos) {
        this.anzahlPhotonenTorpedos = anzahlPhotonenTorpedos;
    }

    /**
     *
     * @return
     */
    public int getAndroidenAnzahl() {
        return androidenAnzahl;
    }

    public void setAndroidenAnzahl(int androidenAnzahl) {
        this.androidenAnzahl = androidenAnzahl;
    }

    public String getSchiffsname() {
        return schiffsname;
    }

    public void setSchiffsname(String schiffsname) {
        this.schiffsname = schiffsname;
    }

    public void addLadung(Ladung ladung) {
        ladungsVerzeichnis.add(ladung);
    }

    public void ausgeben() {
        System.out.println(this);
    }

    /**
     *gibt das Ladungsverzeichnis aus
     */
    public void ladungsverzeichnisAusgeben() {
        ladungsVerzeichnis.forEach(ladung -> System.out.println(
                "Ladung: " + ladung.getBezeichnung() + ", Anzahl: " + ladung.getMenge()));
    }

    /**
     *schiesst einen Phtonentoroedo auf das übergebende Raumschiff. Ruft treffer auf dem übergebendem Raumschiff auf
     * @param raumschiff - das als Ziel gewählte Raumschiff
     */
    public void schiessePhotonenTorpedo(Raumschiff raumschiff) {
        if (anzahlPhotonenTorpedos <= 0) {
            sendeAnAlle("-=*Click*=-");
            return;
        }
        sendeAnAlle("Photonentorpedo abgeschossen");
        anzahlPhotonenTorpedos--;
        raumschiff.treffer();
    }

    /**
     * schiesst eine Phaserkanone auf das übergebende Raumschiff. Ruft treffer auf dem übergebendem Raumschiff auf
     * @param raumschiff - das als Ziel gewählte Raumschiff
     */
    public void schiessePhaserkanone(Raumschiff raumschiff) {
        if (energieversorgungInProzent < ENERGIEVERBRAUCH_BEI_SCHUSS) {
            sendeAnAlle("-=*Click*=-");
            return;
        }
        sendeAnAlle("Phaserkanone abgeschossen");
        setEnergieversorgungInProzent(energieversorgungInProzent - ENERGIEVERBRAUCH_BEI_SCHUSS);
        raumschiff.treffer();
    }

    /**
     * durchsucht das Ladungsverzeichnis nach Photonentorpedos und lädt diese nach. Tut nichts, wenn keine
     * Photonentorpedos im Lager sind.
     * @param anzahlZuLadenderPhotonentorpedos - anzahl der Photonentorpedos, die geldaden werden sollen
     */
    public void ladePhotonenTorpedos(int anzahlZuLadenderPhotonentorpedos) {
        List<Ladung> photonenTorpedos = getPhotonenTorpedos();

        if (sindKeinePhotonenTorpedosImLager(photonenTorpedos)) {
            return;
        }

        ladeGewaehlteTorpedos(anzahlZuLadenderPhotonentorpedos, photonenTorpedos);
    }


    /**
     * repariert das Raumschiff. Stärke der Reparatur hängt von Zufallszahl, der anzahl der zu reparierenden Teile und
     * der Anzahl an Reparaturandroiden ab.
     * @param wirdSchildRepariert - falls true wird der schild repariert
     * @param wirdEnergieversorgungRepariert - falls true wird die Energieversorgung repariert
     * @param wirdHuelleRepariert - falls true wird die Hülle repariert
     * @param anzahlEingesetzterAndroiden - Anzahl der Eingesetzten Reparaturandroiden
     */
    public void setzeReparaturAndroidenEin(boolean wirdSchildRepariert, boolean wirdEnergieversorgungRepariert,
                                           boolean wirdHuelleRepariert, int anzahlEingesetzterAndroiden) {
        int anzahlReperaturen = getAnzahlReperaturen(wirdEnergieversorgungRepariert, wirdHuelleRepariert,
                wirdSchildRepariert);

        int reparaturStaerke = getReparaturStaerke(anzahlEingesetzterAndroiden, anzahlReperaturen);

        repariereSchiffsteile(
                wirdSchildRepariert, wirdEnergieversorgungRepariert, wirdHuelleRepariert, reparaturStaerke);

        setAndroidenAnzahl(androidenAnzahl - anzahlEingesetzterAndroiden);
    }

    /**
     * fügt eine Nachricht dem BroadcastKommunikator einen String hinzu.
     * @param nachricht - String der an den BroadcastKommunikator übergeben wird.
     */
    public void sendeAnAlle(String nachricht) {
        broadcastKommunikator.add(nachricht);
    }

    /**
     *gibt die Einträge in BroadcastKommunikator aus
     */
    public static void getLogbuchEintraege() {
        broadcastKommunikator.forEach(System.out::println);
    }

    /**
     * entfernt alle Ladungen, deren Menge 0 ist.
     */
    public void ladungsverzeichnisAufraeumen() {
        ladungsVerzeichnis.removeIf(Objects::isNull);
        ladungsVerzeichnis.removeIf(ladung -> ladung.getMenge() == 0);
    }



    @Override
    public String toString() {
        return "Raumschiff{" +
                "energieversorgung=" + energieversorgungInProzent +
                ", schildeInProzent=" + schildeInProzent +
                ", huelleInProzent=" + huelleInProzent +
                ", lebenserhaltungssystemeInProzent=" + lebenserhaltungssystemeInProzent +
                ", anzahlPhotonenTorpedos=" + anzahlPhotonenTorpedos +
                ", androidenAnzahl=" + androidenAnzahl +
                ", schiffsname='" + schiffsname + '\'' +
                ", ladungsVerzeichnis=" + ladungsVerzeichnis +
                '}';
    }

    private void treffer() {
        sendeAnAlle(schiffsname + " wurde getroffen");
        setSchildeInProzent(schildeInProzent - SCHADEN_BEI_TREFFER);
        if (schildeInProzent == 0) {
            setEnergieversorgungInProzent(energieversorgungInProzent - SCHADEN_BEI_TREFFER);
            setHuelleInProzent(huelleInProzent - SCHADEN_BEI_TREFFER);
        }
        if (huelleInProzent == 0) {
            setLebenserhaltungssystemeInProzent(0);
            sendeAnAlle("Lebenserhaltungssysteme von " + schiffsname + " wurden vernichtet");
        }
    }

    private List<Ladung> getPhotonenTorpedos() {
        return ladungsVerzeichnis.stream()
                .filter(ladung -> ladung.getBezeichnung().equals("Photonentorpedo"))
                .toList();
    }

    private boolean sindKeinePhotonenTorpedosImLager(List<Ladung> photonenTorpedos) {
        if (photonenTorpedos.isEmpty()) {
            System.out.println("Keine Photonentorpedos gefunden");
            sendeAnAlle("-=*Click*=-");
            return true;
        }
        return false;
    }

    private void ladeGewaehlteTorpedos(int anzahlZuSchiessenderPhotonentorpedos, List<Ladung> photonenTorpedos) {
        int anzahlPhotonenTorpedosInLadung = photonenTorpedos.stream()
                .mapToInt(Ladung::getMenge)
                .sum();

        if (anzahlZuSchiessenderPhotonentorpedos > anzahlPhotonenTorpedosInLadung) {
            anzahlZuSchiessenderPhotonentorpedos = anzahlPhotonenTorpedosInLadung;
        }

        setAnzahlPhotonenTorpedos(anzahlZuSchiessenderPhotonentorpedos + anzahlPhotonenTorpedos);

        System.out.println(anzahlZuSchiessenderPhotonentorpedos + " Photonentorpedos eingesetzt");

        entferneGewaehlteTorpedos(anzahlZuSchiessenderPhotonentorpedos, photonenTorpedos);
    }

    private void entferneGewaehlteTorpedos(int anzahlZuSchiessenderPhotonentorpedos, List<Ladung> photonenTorpedos) {
        for (Ladung ladung : photonenTorpedos) {
            if (ladung.getMenge() < anzahlZuSchiessenderPhotonentorpedos) {
                anzahlZuSchiessenderPhotonentorpedos -= ladung.getMenge();
                ladung.setMenge(0);
            }

            if (ladung.getMenge() == anzahlZuSchiessenderPhotonentorpedos) {
                ladung.setMenge(0);
                return;
            }

            if (ladung.getMenge() > anzahlZuSchiessenderPhotonentorpedos) {
                ladung.setMenge(ladung.getMenge() - anzahlZuSchiessenderPhotonentorpedos);
                return;
            }
        }
    }

    private void repariereSchiffsteile(boolean wirdSchildRepariert, boolean wirdEnergieversorgungRepariert, boolean wirdHuelleRepariert, int reparaturStaerke) {
        if (wirdEnergieversorgungRepariert) {
            setEnergieversorgungInProzent(energieversorgungInProzent + reparaturStaerke);
        }
        if (wirdSchildRepariert) {
            setSchildeInProzent(schildeInProzent + reparaturStaerke);
        }
        if (wirdHuelleRepariert) {
            setHuelleInProzent(huelleInProzent + reparaturStaerke);
        }
    }

    private static int getReparaturStaerke(int anzahlEingestzterAndroiden, int anzahlReperaturen) {
        return new Random().nextInt(0, 101)
                * anzahlEingestzterAndroiden / anzahlReperaturen;
    }

    private static int getAnzahlReperaturen(boolean wirdEnergieversorgungRepariert, boolean wirdHuelleRepariert, boolean wirdSchildRepariert) {
        int anzahlReperaturen = 0;
        if (wirdHuelleRepariert) {
            anzahlReperaturen++;
        }
        if (wirdEnergieversorgungRepariert) {
            anzahlReperaturen++;
        }
        if (wirdSchildRepariert) {
            anzahlReperaturen++;
        }
        return anzahlReperaturen;
    }
}
