package StringLevel3;

import java.util.*;

class FirstNonRepeat {
    static char first(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;
        for (int i = 0; i < s.length(); i++) if (f[s.charAt(i)] == 1) return s.charAt(i);
        return '\0';
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char c = first(s);
        if (c == '\0') System.out.println("No non-repeating char");
        else System.out.println(c);
    }
}
