package StringLevel3;
import java.util.*;

class UniqueChars {
    static int len(String s) {
        int c = 0;
        try {
            while (true) { s.charAt(c); c++; }
        } catch (Exception e) { return c; }
    }

    static char[] uniq(String s) {
        int n = len(s), k = 0;
        char[] u = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean f = true;
            for (int j = 0; j < k; j++) if (u[j] == ch) { f = false; break; }
            if (f) u[k++] = ch;
        }
        return Arrays.copyOf(u, k);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        char[] u = uniq(s);
        System.out.println(Arrays.toString(u));
    }
}
