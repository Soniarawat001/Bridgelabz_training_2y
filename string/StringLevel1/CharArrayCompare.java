package StringLevel1;
import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] manualArray = convertToCharArray(text);
        char[] builtinArray = text.toCharArray();

        boolean result = compareCharArrays(manualArray, builtinArray);
        System.out.println("Arrays equal: " + result);
        sc.close();
    }

    public static char[] convertToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}
