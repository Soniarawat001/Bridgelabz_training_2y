package practice;
import java.util.*;
public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter principal : ");
		float p = sc.nextFloat();
		System.out.println("Enter Rate: ");
		float r = sc.nextFloat();
		System.out.println("Enter Time: ");
		float t = sc.nextFloat();
		float i = (p*r*t)/100;
		System.out.println("the simple Interest is : "+i);
	}

}
