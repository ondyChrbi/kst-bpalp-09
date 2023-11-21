package cz.fei.upce.cv09.rezeracni.system;

public class App {

    public static void main(String[] args) {
        // TODO: User interface na ovladani aplikace.

        Vagon vagon = new Vagon(0, 5);
        Vlak vlak = new Vlak("Pardubický Taxis");

        if (vagon.jeRezervovane(0, 0) == false) {
            System.out.println("Povedla se rezervace: " + vagon.rezervujMisto(0, 0));
        } else {
            System.out.println("Rezervace se nepovedla");
        }

        vlak.pridejVagon(vagon);
        vlak.vypisObsazenost();
    }
}
