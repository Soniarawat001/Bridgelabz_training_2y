package lab_practice_1;

import java.util.Scanner;

public class FriendsDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[10];
        int[] age = new int[10];
        double[] height = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            name[i] = sc.next();
            System.out.print("Enter age of " + name[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + name[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int youngestIndex = 0, tallestIndex = 0;
        for (int i = 1; i < 10; i++) {
            if (age[i] < age[youngestIndex]) youngestIndex = i;
            if (height[i] > height[tallestIndex]) tallestIndex = i;
        }

        System.out.println("Youngest Friend: " + name[youngestIndex] + " (" + age[youngestIndex] + " years)");
        System.out.println("Tallest Friend: " + name[tallestIndex] + " (" + height[tallestIndex] + " cm)");

        sc.close();
    }
}
