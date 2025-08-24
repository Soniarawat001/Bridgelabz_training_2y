package practice;

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        float perimeter = input.nextFloat();

        float side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}
