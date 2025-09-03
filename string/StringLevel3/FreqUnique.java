package StringLevel3;
import java.util.*;

class FreqUnique {
    static char[] uniq(String s) {
        int n = s.length(), k = 0;
        char[] u = new char[n];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean f = true;
            for (int j = 0; j < k; j++) if (u[j] == ch) { f = false; break; }
            if (f) u[k++] = ch;
        }
        return Arrays.copyOf(u, k);
    }

    static String[][] freq(String s) {
        char[] u = uniq(s);
        String[][] out = new String[u.length][2];
        for (int i = 0; i < u.length; i++) {
            int c = 0;
            for (int j = 0; j < s.length(); j++) if (s.charAt(j) == u[i]) c++;
            out[i][0] = String.valueOf(u[i]);
            out[i][1] = String.valueOf(c);
        }
        return out;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[][] res = freq(s);
        for (String[] r : res) System.out.println(r[0] + " -> " + r[1]);
    }
}
