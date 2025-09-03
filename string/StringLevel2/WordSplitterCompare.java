package StringLevel2;
import java.util.Scanner;

public class WordSplitterCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String[] manual = splitWords(txt);
        String[] builtIn = txt.split(" ");
        boolean res = compare(manual, builtIn);
        System.out.println("Arrays equal: " + res);
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

    public static String[] splitWords(String s) {
        int len = findLength(s);
        int wc = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') wc++;
        }

        int[] pos = new int[wc + 1];
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                pos[idx++] = i;
            }
        }
        pos[wc] = len;

        String[] words = new String[wc];
        int start = 0;
        for (int i = 0; i < wc; i++) {
            String w = "";
            for (int j = start; j < pos[i + 1]; j++) {
                if (s.charAt(j) != ' ') w += s.charAt(j);
            }
            words[i] = w;
            start = pos[i + 1] + 1;
        }
        return words;
    }

    public static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
}
