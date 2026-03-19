package activity9;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrintCalendar {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PrintCalendar month year");
            System.exit(1);
        }
        int month = Integer.parseInt(args[0]) - 1;
        int year = Integer.parseInt(args[1]);
        GregorianCalendar calendar = new GregorianCalendar(year, month, 1);
        printMonthTitle(calendar);
        printMonthBody(calendar);
    }
    public static void printMonthTitle(GregorianCalendar calendar) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        System.out.println("        " + monthNames[calendar.get(Calendar.MONTH)] + " " +
                           calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }
    public static void printMonthBody(GregorianCalendar calendar) {
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        int numberOfDaysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);

            if ((i + startDay - 1) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

