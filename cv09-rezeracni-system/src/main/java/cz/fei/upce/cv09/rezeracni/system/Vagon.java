package cz.fei.upce.cv09.rezeracni.system;

public class Vagon {
    private static final int POCET_RAD = 2;

    private final int id;
    private final boolean[][] sedadla;

    public Vagon(int id, int pocetSedadel) {
        this.id = id;
        this.sedadla = new boolean[POCET_RAD][pocetSedadel];
    }

    public boolean rezervujMisto(int x, int y) {
        if (jeRezervovane(x, y)) {
            return false;
        }

        this.sedadla[y][x] = true;
        return true;
    }

    public void vypisObsazenost() {
        System.out.println("Id vagonu: " + this.getId());

        // Projdi sedadlo po sedadlu a vypis jejich obsazenost.
        for (int y = 0; y < POCET_RAD; ++y) {
            for (int x = 0; x < this.sedadla[y].length; ++x) {
                if (this.jeRezervovane(x, y)) {
                    System.out.print("X ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.println();
        }
    }

    // TODO: Metoda pro uvolneni rezervovaneho mista.

    public boolean jeRezervovane(int x, int y) {
        return this.sedadla[y][x];
    }

    public int getId() {
        return id;
    }
}
