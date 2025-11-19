import java.util.Scanner;

public class sectionB{

   
static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    static int nthPrime(int n) {
        int count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        return num;
    }

    static int countPrimes(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) c++;
        }
        return c;
    }

    static int countDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int c = 0;
        while (n > 0) {
            n /= 10;
            c++;
        }
        return c;
    }

    static int countUnique(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int cnt = 0;
        for (int i : freq) {
            if (i > 0) cnt++;
        }
        return cnt;
    }

    static int countNonRepeated(int n) {
        n = Math.abs(n);
        int[] freq = new int[10];
        while (n > 0) {
            freq[n % 10]++;
            n /= 10;
        }
        int c = 0;
        for (int x : freq) {
            if (x == 1) c++;
        }
        return c;
    }

    static int digitSum(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }

    static int digitSumEven(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0) s += d;
            n /= 10;
        }
        return s;
    }

    static int digitSumOdd(int n) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 != 0) s += d;
            n /= 10;
        }
        return s;
    }

    static int digitSumOpt(int n, boolean even) {
        n = Math.abs(n);
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            if (even && d % 2 == 0) s += d;
            if (!even && d % 2 != 0) s += d;
            n /= 10;
        }
        return s;
    }
}