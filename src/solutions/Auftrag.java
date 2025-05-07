package solutions;

public class Auftrag {
    private Artikel artikel;
    private int menge;

    public Auftrag(Artikel artikel, int menge) {
        this.artikel = artikel;
        this.menge = menge;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public int getMenge() {
        return menge;
    }

    public double getAuftragswert() {
        return this.menge * this.artikel.getPreis();
    }

    public String toString() {
        return artikel.toString() + "; Menge: " + String.valueOf(menge);
    }

    public static double getGesamtwert(Auftrag... auftraege) {
        double result = 0;
        for (Auftrag auftrag : auftraege) {
            result += auftrag.getAuftragswert();
        }
        return result;
    }
}
