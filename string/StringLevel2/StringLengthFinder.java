package StringLevel2;
import java.util.Scanner;

public class StringLengthFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int customLen = findLength(str);
        int builtInLen = str.length();
        System.out.println("Custom Length: " + customLen);
        System.out.println("Built-in Length: " + builtInLen);
        sc.close();
    }

    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }
}
