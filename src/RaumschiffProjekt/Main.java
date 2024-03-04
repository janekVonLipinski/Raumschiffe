package RaumschiffProjekt;

import RaumschiffProjekt.TransportObjekte.Ladung;
import RaumschiffProjekt.Schiff.Raumschiff;
import RaumschiffProjekt.TransportObjekte.konkreteLadungen.Transportgut;

public class Main {

    public static void main(String[] args) {
        Ladung saft = new Transportgut("Ferengi Scneckensaft", 200,
                0, 0, 0);
        Ladung schwert = new Transportgut("Bat'öeth Klingonen Schwert", 200,
                0,0,0);

        Ladung schrott = new Transportgut("Borg-Schrott", 5,
                0,0,0);
        Ladung matiere = new Transportgut("rote Materie", 2,
                0,0,0);
        Ladung plasma = new Transportgut("Plasma-Waffe", 50,
                0,0,0);

        Ladung sonde = new Transportgut("Forschungssonde", 35,
                0,0,0);
        Ladung torpedo = new Transportgut("Photonentorpedo", 3,
                0,0,0);

        Raumschiff klingonen = new Raumschiff(
                100, 100, 100,
                100,
                1, 2, "IKS Hegh'ta"
        );
        klingonen.addLadung(saft);
        klingonen.addLadung(schwert);

        Raumschiff romulaner = new Raumschiff(
                100, 100, 100,
                100, 2, 2,
                "IRW Khazara"
        );
        romulaner.addLadung(schrott);
        romulaner.addLadung(matiere);
        romulaner.addLadung(plasma);

        Raumschiff vulkanier = new Raumschiff(
                80, 80, 50,
                100, 0, 5,
                "Ni'Var"
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
