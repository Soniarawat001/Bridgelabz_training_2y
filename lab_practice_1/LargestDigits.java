package lab_practice_1;

import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int largest = -1, secondLargest = -1;

        while (num > 0) {
            int digit = num % 10;
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
            num /= 10;
        }

        System.out.println("Largest Digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second Largest Digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }

        sc.close();
    }
}
