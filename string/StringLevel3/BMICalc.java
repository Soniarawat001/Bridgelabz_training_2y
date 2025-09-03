package StringLevel3;
import java.util.*;

class BMICalc {
    static String stat(double bmi) {
        if (bmi <= 18.4) return "Underweight";
        else if (bmi <= 24.9) return "Normal";
        else if (bmi <= 39.9) return "Overweight";
        else return "Obese";
    }

    static String[][] calc(int[][] arr) {
        String[][] out = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double h = arr[i][1] / 100.0;
            double w = arr[i][0];
            double b = w / (h * h);
            out[i][0] = String.valueOf(w);
            out[i][1] = String.valueOf(arr[i][1]);
            out[i][2] = String.format("%.2f", b);
            out[i][3] = stat(b);
        }
        return out;
    }

    static void show(String[][] arr) {
        System.out.printf("%-10s%-10s%-10s%-15s\n", "Weight", "Height", "BMI", "Status");
        for (String[] r : arr)
            System.out.printf("%-10s%-10s%-10s%-15s\n", r[0], r[1], r[2], r[3]);
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[10][2];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        sc.close();
        show(calc(arr));
    }
}
