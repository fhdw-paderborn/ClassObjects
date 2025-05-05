package solutions;
/**
 * Klasse Sparbuch zur Verwaltung eines Sparkontos mit Zinsfunktionen.
 * 
 * Diese Klasse implementiert die Lösung zur Aufgabe Exercise02_Sparbuch:
 * - Speichert Kontonummer, Kapital und Zinssatz
 * - Ermöglicht Ein- und Auszahlungen
 * - Berechnet Zinsen und Erträge nach Laufzeit
 */
public class Sparbuch {
    
    private String kontonummer;
    private double kapital;
    private double zinssatz;
    
    /**
     * Konstruktor: Initialisiert ein Sparbuch mit Kontonummer, Startkapital und Zinssatz.
     * 
     * @param kontonummer Die Kontonummer des Sparkontos
     * @param kapital Das Startkapital
     * @param zinssatz Der Zinssatz in Prozent (z.B. 2.5 für 2,5%)
     */
    public Sparbuch(String kontonummer, double kapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = kapital;
        this.zinssatz = zinssatz;
    }
    
    /**
     * Erhöht das Kapital um den angegebenen Betrag.
     * 
     * @param betrag Der einzuzahlende Betrag
     */
    public void zahleEin(double betrag) {
        if (betrag > 0) {
            this.kapital += betrag;
        }
    }
    
    /**
     * Vermindert das Kapital um den angegebenen Betrag, sofern genügend Kapital vorhanden ist.
     * 
     * @param betrag Der abzuhebende Betrag
     */
    public void hebeAb(double betrag) {
        if (betrag > 0 && betrag <= this.kapital) {
            this.kapital -= betrag;
        }
    }
    
    /**
     * Berechnet das erwartete Kapital nach einer bestimmten Laufzeit
     * unter Berücksichtigung von Zins und Zinseszins.
     * 
     * @param laufzeitInJahren Die Laufzeit in Jahren
     * @return Das berechnete Kapital nach Ablauf der Laufzeit
     */
    public double getErtrag(int laufzeitInJahren) {
        if (laufzeitInJahren <= 0) {
            return this.kapital;
        }
        
        // Formel: Kapital * (1 + Zinssatz/100)^Laufzeit
        double zinsfaktor = 1 + (this.zinssatz / 100.0);
        return this.kapital * Math.pow(zinsfaktor, laufzeitInJahren);
    }
    
    /**
     * Erhöht das Kapital um den jährlichen Zinsertrag.
     */
    public void verzinse() {
        double zinsertrag = this.kapital * (this.zinssatz / 100.0);
        this.kapital += zinsertrag;
    }
    
    /**
     * Gibt die Kontonummer zurück.
     * 
     * @return Die Kontonummer des Sparkontos
     */
    public String getKontonummer() {
        return this.kontonummer;
    }
    
    /**
     * Gibt das aktuelle Kapital zurück.
     * 
     * @return Das aktuelle Kapital
     */
    public double getKapital() {
        return this.kapital;
    }
    
    /**
     * Gibt den Zinssatz zurück.
     * 
     * @return Der Zinssatz in Prozent
     */
    public double getZinssatz() {
        return this.zinssatz;
    }
}