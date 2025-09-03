package StringLevel3;
import java.util.*;

class FreqNested {
    static String[] freq(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            if (ch[i] == '0') continue;
            f[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    f[i]++;
                    ch[j] = '0';
                }
            }
        }
        int c = 0;
        for (int x : f) if (x > 0) c++;
        String[] out = new String[c];
        int k = 0;
        for (int i = 0; i < n; i++) if (f[i] > 0) {
            out[k++] = ch[i] + " -> " + f[i];
        }
        return out;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] res = freq(s);
        for (String r : res) System.out.println(r);
    }
}
