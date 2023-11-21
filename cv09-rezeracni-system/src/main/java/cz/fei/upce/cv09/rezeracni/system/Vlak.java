package cz.fei.upce.cv09.rezeracni.system;

public class Vlak {
    private static final int VYCHOZI_POCET_VAGONU = 5;

    private final String jmeno;
    private final Vagon[] vagony;
    private int aktualniIndex;

    public Vlak(String jmeno) {
        this.jmeno = jmeno;
        this.vagony = new Vagon[VYCHOZI_POCET_VAGONU];
        this.aktualniIndex = 0;
    }

    /*🐰🥚*/
    public void vypisObsazenost() {
        System.out.println("Obsazenost vlaku: " + this.getJmeno());

        for (Vagon vagon : this.vagony) {
            if (vagon == null) {
                continue;
            }

            vagon.vypisObsazenost();
        }
    }

    // TODO: Zbyle metody a osetreni.
    // TODO: Dynamicke zvetsovani pole pri nedostatku indexu.

    public void pridejVagon(Vagon vagon) {
        this.vagony[aktualniIndex] = vagon;
        aktualniIndex++;
    }

    public String getJmeno() {
        return jmeno;
    }
}
