package StringLevel2;
import java.util.Scanner;

public class TrimSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] p = trimIndexes(s);
        String trimmed = subStr(s, p[0], p[1]);
        String builtIn = s.trim();
        boolean same = compare(trimmed, builtIn);
        System.out.println("Custom Trim: '" + trimmed + "'");
        System.out.println("Built-in Trim: '" + builtIn + "'");
        System.out.println("Equal: " + same);
        sc.close();
    }

    public static int[] trimIndexes(String s) {
        int st = 0, e = -1;
        int l = 0;
        try {
            while (true) s.charAt(l++);
        } catch (Exception ex) {}
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) != ' ') {
                st = i;
                break;
            }
        }
        for (int i = l - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                e = i + 1;
                break;
            }
        }
        return new int[]{st, e};
    }

    public static String subStr(String s, int st, int e) {
        String r = "";
        for (int i = st; i < e; i++) r += s.charAt(i);
        return r;
    }

    public static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
}
