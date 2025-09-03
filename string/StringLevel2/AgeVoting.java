package StringLevel2;
import java.util.Scanner;

public class AgeVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = getAges(10);
        String[][] res = checkVoting(ages);
        showTable(res);
        sc.close();
    }

    public static int[] getAges(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = 10 + (int)(Math.random() * 90);
        return a;
    }

    public static String[][] checkVoting(int[] a) {
        String[][] r = new String[a.length][2];
        for (int i = 0; i < a.length; i++) {
            r[i][0] = String.valueOf(a[i]);
            if (a[i] < 0) r[i][1] = "Invalid";
            else r[i][1] = a[i] >= 18 ? "Yes" : "No";
        }
        return r;
    }

    public static void showTable(String[][] d) {
        for (int i = 0; i < d.length; i++) {
            System.out.println("Age: " + d[i][0] + " -> Can Vote: " + d[i][1]);
        }
    }
}
