package StringLevel3;
import java.util.*;

class AnagramCheck {
    static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] f1 = new int[256], f2 = new int[256];
        for (int i = 0; i < s1.length(); i++) f1[s1.charAt(i)]++;
        for (int i = 0; i < s2.length(); i++) f2[s2.charAt(i)]++;
        for (int i = 0; i < 256; i++) if (f1[i] != f2[i]) return false;
        return true;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        sc.close();
        System.out.println(isAnagram(s1, s2));
    }
}
