package StringLevel2;
public class StudentGradeReport {
    public static void main(String[] args) {
        int[][] pcm = genScores(10);
        double[][] res = calc(pcm);
        String[] g = grade(res);
        show(pcm, res, g);
    }

    public static int[][] genScores(int n) {
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = 40 + (int)(Math.random() * 61);
            s[i][1] = 40 + (int)(Math.random() * 61);
            s[i][2] = 40 + (int)(Math.random() * 61);
        }
        return s;
    }

    public static double[][] calc(int[][] s) {
        double[][] r = new double[s.length][3];
        for (int i = 0; i < s.length; i++) {
            double t = s[i][0] + s[i][1] + s[i][2];
            double a = t / 3;
            double p = (t / 300) * 100;
            r[i][0] = Math.round(t * 100.0) / 100.0;
            r[i][1] = Math.round(a * 100.0) / 100.0;
            r[i][2] = Math.round(p * 100.0) / 100.0;
        }
        return r;
    }

    public static String[] grade(double[][] p) {
        String[] g = new String[p.length];
        for (int i = 0; i < p.length; i++) {
            double per = p[i][2];
            if (per >= 80) g[i] = "A";
            else if (per >= 70) g[i] = "B";
            else if (per >= 60) g[i] = "C";
            else if (per >= 50) g[i] = "D";
            else if (per >= 40) g[i] = "E";
            else g[i] = "R";
        }
        return g;
    }

    public static void show(int[][] s, double[][] r, String[] g) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i][0] + "\t" + s[i][1] + "\t" + s[i][2] + "\t");
            System.out.print(r[i][0] + "\t" + r[i][1] + "\t" + r[i][2] + "\t");
            System.out.println(g[i]);
        }
    }
}
