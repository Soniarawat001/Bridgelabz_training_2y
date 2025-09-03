package StringLevel2;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        String[][] res = new String[g][3];
        int uw = 0, cw = 0;
        for (int i = 0; i < g; i++) {
            String u = sc.next();
            String c = getComp();
            String w = getWinner(u, c);
            if (w.equals("User")) uw++;
            else if (w.equals("Computer")) cw++;
            res[i][0] = u;
            res[i][1] = c;
            res[i][2] = w;
        }
        showResults(res, uw, cw, g);
        sc.close();
    }

    public static String getComp() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }

    public static String getWinner(String u, String c) {
        if (u.equals(c)) return "Draw";
        if ((u.equals("rock") && c.equals("scissors")) ||
            (u.equals("paper") && c.equals("rock")) ||
            (u.equals("scissors") && c.equals("paper")))
            return "User";
        return "Computer";
    }

    public static void showResults(String[][] r, int uw, int cw, int g) {
        for (int i = 0; i < r.length; i++) {
            System.out.println("User: " + r[i][0] + " | Computer: " + r[i][1] + " | Winner: " + r[i][2]);
        }
        System.out.println("User Wins: " + uw + " (" + ((uw * 100.0) / g) + "%)");
        System.out.println("Computer Wins: " + cw + " (" + ((cw * 100.0) / g) + "%)");
    }
}
