package StringLevel2;
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        int[] res = countVC(txt);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
        sc.close();
    }

    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "V";
            else return "C";
        }
        return "N";
    }

    public static int[] countVC(String s) {
        int[] c = new int[2];
        for (int i = 0; ; i++) {
            try {
                char ch = s.charAt(i);
                String t = checkChar(ch);
                if (t.equals("V")) c[0]++;
                else if (t.equals("C")) c[1]++;
            } catch (Exception e) {
                break;
            }
        }
        return c;
    }
}
