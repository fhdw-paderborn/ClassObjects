package solutions;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        // Prüfe grundlegende Einschränkungen
        if (year <= 0 || month < 1 || month > 12 || day < 1) {
            throw new IllegalArgumentException("Ungültiges Datum: Tag, Monat oder Jahr außerhalb des gültigen Bereichs");
        }

        // Prüfe, ob der Tag für den Monat gültig ist
        int daysInMonth = getDaysInMonth(month, year);
        if (day > daysInMonth) {
            throw new IllegalArgumentException("Ungültiger Tag für Monat " + month + ": " + day);
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String display() {
        return String.format("%02d.%02d.%04d", day, month, year);
    }

    public boolean isLeapYear() {
        return isLeapYear(this.year);
    }

    private boolean isLeapYear(int year) {
        // Ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist,
        // außer es ist durch 100 teilbar und nicht durch 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public int getDaysInMonth() {
        return getDaysInMonth(this.month, this.year);
    }

    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                return isLeapYear(year) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
}