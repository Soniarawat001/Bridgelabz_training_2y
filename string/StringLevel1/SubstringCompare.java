package StringLevel1;
import java.util.Scanner;

public class SubstringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String manualSub = createSubstringByCharAt(text, start, end);
        String builtinSub = text.substring(start, end);

        boolean result = compareStringsByCharAt(manualSub, builtinSub);
        System.out.println("Are substrings equal: " + result);
    sc.close();
    }

    public static String createSubstringByCharAt(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStringsByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}
