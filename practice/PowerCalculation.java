package practice;
import java.util.*;
public class PowerCalculation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the base: ");
        float base = sc.nextFloat();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        float result = (float) Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
	}

}
