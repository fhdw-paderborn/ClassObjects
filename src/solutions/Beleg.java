package solutions;

public class Beleg {
    private static int numberCounter = 10_000;
    private int belegnummer;

    public Beleg() {
        this.belegnummer = numberCounter++;
    }

    public int getBelegnummer() {
        return belegnummer;
    }

    public static int getNaechsteBelegnummer() {
        return numberCounter;
    }

    public static int getAnzahlBelege() {
        return numberCounter - 10_000;
    }
}
