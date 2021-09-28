package week8;

public class Meeting  { // designed by programmer B
    Meeting(String c, String t, Date d, String v)      {
        chairman = c; title = t;  date = d; venue = v;
    }
    void postpone(int days) {
        date.day += days;
//        date.advance(days);
    }
    void print() {
        System.out.print(title+" "+chairman+ " "+venue);
        date.print();
    }

    public static void main(String arg[]) {
        Date d = new Date(28,8,2001);
        Meeting meet=new Meeting("Tom","AGM",d,"9.8");
        meet.print();
        meet.postpone(7);
        meet.print();
    }

    private String title;
    private String chairman;
    private String venue;
    private Date date;
}

