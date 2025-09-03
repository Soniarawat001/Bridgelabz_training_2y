package StringLevel3;
import java.util.*;

class CalendarDisplay {
    static String monthName(int m) {
        String[] mon = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return mon[m-1];
    }

    static int daysInMonth(int m, int y) {
        int[] d = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m==2 && leap(y)) return 29;
        return d[m-1];
    }

    static boolean leap(int y) {
        return (y%400==0)||(y%4==0 && y%100!=0);
    }

    static int firstDay(int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (1 + x + (31*m0)/12) % 7;
    }

    static void show(int m, int y) {
        System.out.printf("     %s %d\n", monthName(m), y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd = firstDay(m,y);
        int days = daysInMonth(m,y);
        for (int i=0;i<fd;i++) System.out.print("    ");
        for (int d=1; d<=days; d++) {
            System.out.printf("%3d ", d);
            if ((d+fd)%7==0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        show(m,y);
    }
}
