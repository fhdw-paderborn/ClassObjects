package solutions;

public class Sparbuch {
    
    private String kontonummer;
    private double kapital;
    private double zinssatz;

    public Sparbuch(String kontonummer, double startkapital, double zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = startkapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(double add) {
        this.kapital += add;
    }

    public void hebeAb(double withdraw) {
        if(kapital - withdraw < 0) {
            System.out.println("Not enough money in account");
        } else {
            this.kapital -= withdraw;
        }
    }

    public double getErtrag(int time) {
        double powerResult = Math.pow(1 + (zinssatz / 100), time);
        return kapital * powerResult;
    }

    public void verzinse() {
        kapital += kapital * (zinssatz / 100);
    }

    public String getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public double getZinssatz() {
        return zinssatz;
    }



}
