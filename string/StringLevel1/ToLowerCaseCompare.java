package StringLevel1;
import java.util.Scanner;

public class ToLowerCaseCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String manualLower = convertToLowerCase(input);
        String builtinLower = input.toLowerCase();

        boolean result = compareStringsByCharAt(manualLower, builtinLower);
        System.out.println("Are lowercase strings equal: " + result);
        sc.close();   }

    public static String convertToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char)(c + 32);
            }
            result += c;
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
