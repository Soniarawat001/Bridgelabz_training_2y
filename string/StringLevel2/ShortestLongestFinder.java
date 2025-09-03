package StringLevel2;
import java.util.Scanner;

public class ShortestLongestFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String[] words = splitWords(txt);
        String[][] table = wordLengthTable(words);
        int[] res = findShortestLongest(table);
        System.out.println("Shortest: " + table[res[0]][0]);
        System.out.println("Longest: " + table[res[1]][0]);
        sc.close();
    }

    public static int findLength(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {
            return i;
        }
    }

    public static String[] splitWords(String s) {
        int len = findLength(s);
        int wc = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') wc++;
        int[] pos = new int[wc + 1];
        int idx = 1;
        for (int i = 0; i < len; i++) if (s.charAt(i) == ' ') pos[idx++] = i;
        pos[wc] = len;
        String[] w = new String[wc];
        int st = 0;
        for (int i = 0; i < wc; i++) {
            String t = "";
            for (int j = st; j < pos[i + 1]; j++) if (s.charAt(j) != ' ') t += s.charAt(j);
            w[i] = t;
            st = pos[i + 1] + 1;
        }
        return w;
    }

    public static String[][] wordLengthTable(String[] arr) {
        String[][] t = new String[arr.length][2];
        for (int i = 0; i < arr.length; i++) {
            t[i][0] = arr[i];
            t[i][1] = String.valueOf(findLength(arr[i]));
        }
        return t;
    }

    public static int[] findShortestLongest(String[][] data) {
        int min = Integer.parseInt(data[0][1]);
        int max = min, minIdx = 0, maxIdx = 0;
        for (int i = 1; i < data.length; i++) {
            int n = Integer.parseInt(data[i][1]);
            if (n < min) {
                min = n;
                minIdx = i;
            }
            if (n > max) {
                max = n;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }
}
