package solutions;

/**
 * Klasse Zaehler zum Hochzählen und Zurücksetzen eines int-Werts.
 * 
 * Diese Klasse implementiert die Lösung zur Aufgabe Exercise01_Zaehler:
 * - Eine Instanzvariable vom Typ int speichert den aktuellen Zählerwert
 * - Der Konstruktor initialisiert den Zählerwert mit 0
 * - Die Methode hochzaehlen() erhöht den Zählerwert um 1
 * - Die Methode zuruecksetzen() setzt den Zählerwert auf 0 zurück
 * - Die Methode getWert() gibt den aktuellen Zählerwert zurück
 */
public class Zaehler {
    
    // Instanzvariable für den aktuellen Zählerwert
    private int wert;
    
    /**
     * Konstruktor: Initialisiert den Zähler mit dem Wert 0.
     */
    public Zaehler() {
        this.wert = 0;
    }
    
    /**
     * Erhöht den Zählerwert um 1.
     */
    public void hochzaehlen() {
        this.wert++;
    }
    
    /**
     * Setzt den Zählerwert auf 0 zurück.
     */
    public void zuruecksetzen() {
        this.wert = 0;
    }
    
    /**
     * Gibt den aktuellen Zählerwert zurück.
     * 
     * @return Der aktuelle Zählerwert
     */
    public int getWert() {
        return this.wert;
    }
}
