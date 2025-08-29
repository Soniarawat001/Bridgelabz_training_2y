package lab_practice_1;

import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        int[] f = new int[10];
        for (int i = 0; i < s.length(); i++) {
            f[s.charAt(i) - '0']++;
        }
        for (int i = 0; i < 10; i++) {
            if (f[i] > 0) {
                System.out.println(i + " -> " + f[i]);
            }
        }
        sc.close();
    }
}
