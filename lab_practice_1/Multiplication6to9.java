package lab_practice_1;

public class Multiplication6to9 {
    public static void main(String[] args) {
        int[][] results = new int[4][10];

        for (int n = 6; n <= 9; n++) {
            for (int i = 1; i <= 10; i++) {
                results[n - 6][i - 1] = n * i;
            }
        }

        for (int n = 6; n <= 9; n++) {
            System.out.println("Multiplication table of " + n + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " * " + i + " = " + results[n - 6][i - 1]);
            }
            System.out.println();
        }
    }
}
