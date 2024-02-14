package RaumschiffProjekt;

import RaumschiffProjekt.Schiff.Ladung;
import RaumschiffProjekt.Schiff.Raumschiff;

public class Main {

    public static void main(String[] args) {
        Ladung saft = new Ladung("Ferengi Scneckensaft", 200);
        Ladung schwert = new Ladung("Bat'öeth Klingonen Schwert", 200);

        Ladung schrott = new Ladung("Borg-Schrott", 5);
        Ladung matiere = new Ladung("rote Materie", 2);
        Ladung plasma = new Ladung("Plasma-Waffe", 50);

        Ladung sonde = new Ladung("Forschungssonde", 35);
        Ladung torpedo = new Ladung("Photonentorpedo", 3);

        Raumschiff klingonen = new Raumschiff(
                100, 100, 100, 100,
                1, 2, "IKS Hegh'ta"
        );
        klingonen.addLadung(saft);
        klingonen.addLadung(schwert);

        Raumschiff romulaner = new Raumschiff(
                100, 100, 100, 100,
                2, 2, "IRW Khazara"
        );
        romulaner.addLadung(schrott);
        romulaner.addLadung(matiere);
        romulaner.addLadung(plasma);

        Raumschiff vulkanier = new Raumschiff(
                80, 80, 50, 100,
                0, 5, "Ni'Var"
        );
        vulkanier.addLadung(sonde);
        vulkanier.addLadung(torpedo);

        klingonen.schiessePhotonenTorpedo(romulaner);
        romulaner.schiessePhaserkanone(klingonen);
        vulkanier.sendeAnAlle("Gewalt ist nicht logisch");

        klingonen.ausgeben();
        klingonen.ladungsverzeichnisAusgeben();

        vulkanier.setzeReparaturAndroidenEin(true, true,
                true, vulkanier.getAndroidenAnzahl());

        vulkanier.ladePhotonenTorpedos(3);
        vulkanier.ladungsverzeichnisAusgeben();
        klingonen.schiessePhotonenTorpedo(romulaner);
        klingonen.schiessePhotonenTorpedo(romulaner);

        vulkanier.ausgeben();
        klingonen.ausgeben();
        romulaner.ausgeben();

        Raumschiff.getLogbuchEintraege();
    }
}
