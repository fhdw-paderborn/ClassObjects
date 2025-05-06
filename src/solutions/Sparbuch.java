package solutions;

public class Sparbuch {
    
    private int kontonummer;
    private double kapital;
    private float zinssatz;

    public Sparbuch(int kontonummer, double startkapital, float zinssatz) {
        this.kontonummer = kontonummer;
        this.kapital = startkapital;
        this.zinssatz = zinssatz;
    }

    public void zahleEin(int add) {
        this.kapital += add;
    }

    public void hebeAb(int withdraw) {
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

    public int getKontonummer() {
        return kontonummer;
    }

    public double getKapital() {
        return kapital;
    }

    public float getZinssatz() {
        return zinssatz;
    }



}
