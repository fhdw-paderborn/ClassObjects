package solutions;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        if(isValideDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }

    private boolean isValideDate(int day, int month, int year) {
        if (day <= 0 || month > 12 || month <= 0 || year <= 0) {
            return false;
        }

        if (day > getDaysInMonth(month, year)) {
            return false;
        }

        return true;
    }

    public boolean isLeapYear() {
        return this.isLeapYear(this.year);
    }

    public boolean isLeapYear(int year) {
        
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String display() {
        String formatDay = String.format("%02d", this.day); //the 0 makes sure zeros are used as padding
        String formatMonth = String.format("%02d", this.month);
        String formatYear = String.format("%04d", this.year);
        return formatDay + "." + formatMonth + "." + formatYear;
    }

    public int getDaysInMonth() {
        return this.getDaysInMonth(this.month, this.year);
    }

    public int getDaysInMonth(int month,int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if(isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }  
            default:
                throw new IllegalArgumentException();
        }
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
}
