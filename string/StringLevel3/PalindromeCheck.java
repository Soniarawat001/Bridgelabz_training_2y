package StringLevel3;

import java.util.*;

class PalindromeCheck {
    static boolean logic1(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) if (s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }

    static boolean logic2(String s, int i, int j) {
        if (i >= j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        return logic2(s, i + 1, j - 1);
    }

    static boolean logic3(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) r += s.charAt(i);
        char[] a1 = s.toCharArray(), a2 = r.toCharArray();
        for (int i = 0; i < a1.length; i++) if (a1[i] != a2[i]) return false;
        return true;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println("Logic1: " + logic1(s));
        System.out.println("Logic2: " + logic2(s, 0, s.length() - 1));
        
        System.out.println("Logic3: " + logic3(s));
    }
}
