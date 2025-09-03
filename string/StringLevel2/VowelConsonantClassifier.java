package StringLevel2;
import java.util.Scanner;

public class VowelConsonantClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String[][] res = classifyChars(txt);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + " -> " + res[i][1]);
        }
        sc.close();
    }

    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    public static String[][] classifyChars(String s) {
        int len = 0;
        try {
            while (true) s.charAt(len++);
        } catch (Exception e) {}
        String[][] res = new String[len][2];
        for (int i = 0; i < len; i++) {
            res[i][0] = String.valueOf(s.charAt(i));
            res[i][1] = checkChar(s.charAt(i));
        }
        return res;
    }
}
