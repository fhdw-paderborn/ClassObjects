package solutions;
/**
 * Klasse Beleg zur Verwaltung von Belegen mit automatisch generierten Belegnummern.
 * 
 * Diese Klasse implementiert die Lösung zur Aufgabe Exercise03_Beleg:
 * - Starte die Nummerierung bei 10000
 * - Jeder neue Beleg erhält automatisch die nächste Nummer
 */
public class Beleg {
    
    // Statische Variable (Klassenvariable) zur Verwaltung der nächsten Belegnummer
    private static int naechsteBelegnummer = 10000;
    
    // Instanzvariable für die Belegnummer dieses Belegs
    private final int belegnummer;
    
    /**
     * Konstruktor: Erstellt einen neuen Beleg mit der nächsten verfügbaren Belegnummer.
     */
    public Beleg() {
        // Aktuelle Belegnummer zuweisen
        this.belegnummer = naechsteBelegnummer;
        
        // Belegnummer für den nächsten Beleg erhöhen
        naechsteBelegnummer++;
    }
    
    /**
     * Gibt die Belegnummer dieses Belegs zurück.
     * 
     * @return Die Belegnummer des Belegs
     */
    public int getBelegnummer() {
        return this.belegnummer;
    }
    
    /**
     * Gibt die nächste zu vergebende Belegnummer zurück.
     * 
     * @return Die nächste Belegnummer
     */
    public static int getNaechsteBelegnummer() {
        return naechsteBelegnummer;
    }
    
    /**
     * Berechnet die Anzahl der bisher erstellten Belege.
     * 
     * @return Die Anzahl der Belege
     */
    public static int getAnzahlBelege() {
        // Die Anzahl der Belege ist die Differenz zwischen der nächsten Belegnummer
        // und der Startbelegnummer (10000)
        return naechsteBelegnummer - 10000;
    }
}