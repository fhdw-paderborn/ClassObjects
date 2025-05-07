package solutions;

public class Zaehler {
    
    private int counter;

    public Zaehler() {
        this.counter = 0;
    }

    public void hochzaehlen() {
        this.counter++;
    }

    public void zuruecksetzen() {
        this.counter = 0;
    }

    public int getWert() {
        return counter;
    }
}
