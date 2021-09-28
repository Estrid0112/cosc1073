package week8;

class Date {   // Designed by programmer A
    Date(int d, int m, int y) {
        day = d;  month = m; year = y;
    }
    // advances d days taking care of month and year
    void advance(int d) {
        day += d;
        if (day > 31){
            month += 1;
            day = day - 31;
        }
    }
    void print() {
        System.out.println(" "+day +"/"+month+"/"+year);
    }
    protected int day;
    protected int month;
    protected int year;
}

