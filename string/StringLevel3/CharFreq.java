package StringLevel3;

import java.util.*;

class CharFreq {
    static String[][] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++) f[s.charAt(i)]++;
        int c = 0;
        for (int x : f) if (x > 0) c++;
        String[][] out = new String[c][2];
        int k = 0;
        for (int i = 0; i < 256; i++) if (f[i] > 0) {
            out[k][0] = String.valueOf((char)i);
            out[k][1] = String.valueOf(f[i]);
            k++;
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
