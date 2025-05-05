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
        return menge * artikel.getPreis();
    }

    @Override
    public String toString() {
        return "Auftrag [artikel=" + artikel + ", menge=" + menge + ", wert=" + getAuftragswert() + "€]";
    }

    /**
     * Berechnet den Gesamtwert aller übergebenen Aufträge.
     * 
     * @param auftraege Ein oder mehrere Aufträge, deren Gesamtwert berechnet werden soll
     * @return Summe aller Auftragswerte
     */
    public static double getGesamtwert(Auftrag... auftraege) {
        double gesamtwert = 0.0;
        
        for (Auftrag auftrag : auftraege) {
            gesamtwert += auftrag.getAuftragswert();
        }
        
        return gesamtwert;
    }
}