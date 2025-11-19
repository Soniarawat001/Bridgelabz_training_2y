import java.util.Scanner;

public class sectionA{

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    static int lastDigit(int n) {
        return Math.abs(n % 10);
    }

    static int secondLastDigit(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }

    static int sumLastDigits(int a, int b) {
        return Math.abs(a % 10) + Math.abs(b % 10);
    }

    static boolean isMultiple(int n, int m) {
        return n % m == 0;
    }

    static int countEven5(int a, int b, int c, int d, int e) {
        int c1 = 0;
        if (a % 2 == 0) c1++;
        if (b % 2 == 0) c1++;
        if (c % 2 == 0) c1++;
        if (d % 2 == 0) c1++;
        if (e % 2 == 0) c1++;
        return c1;
    }

    static int countOdd5(int a, int b, int c, int d, int e) {
        int c1 = 0;
        if (a % 2 != 0) c1++;
        if (b % 2 != 0) c1++;
        if (c % 2 != 0) c1++;
        if (d % 2 != 0) c1++;
        if (e % 2 != 0) c1++;
        return c1;
    }

    static void countEvenOdd5(int a, int b, int c, int d, int e) {
        int even = 0, odd = 0;
        int[] arr = {a, b, c, d, e};
        for (int x : arr) {
            if (x % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}