package StringLevel2;
import java.util.Scanner;

public class WordLengthTabular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String[] words = splitWords(txt);
        String[][] table = buildTable(words);
        for (int i = 0; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + " -> " + len);
        }
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

    public static String[][] buildTable(String[] arr) {
        String[][] res = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            res[i][0] = arr[i];
            res[i][1] = String.valueOf(findLength(arr[i]));
        }
        return res;
    }
}
