package StringLevel3;
import java.util.*;

class DeckGame {
    static String[] init() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String s : suits) for (String r : ranks) deck[k++] = r + " of " + s;
        return deck;
    }

    static void shuffle(String[] d) {
        int n = d.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String t = d[i];
            d[i] = d[r];
            d[r] = t;
        }
    }

    static String[][] deal(String[] d, int n, int p) {
        if (n % p != 0) return null;
        int c = n / p;
        String[][] out = new String[p][c];
        int k = 0;
        for (int i = 0; i < p; i++) for (int j = 0; j < c; j++) out[i][j] = d[k++];
        return out;
    }

    static void show(String[][] g) {
        if (g == null) {
            System.out.println("Cards cannot be evenly distributed");
            return;
        }
        for (int i = 0; i < g.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (String c : g[i]) System.out.print(c + ", ");
            System.out.println();
        }
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        sc.close();
        String[] deck = init();
        shuffle(deck);
        show(deal(deck,n,p));
    }
}
