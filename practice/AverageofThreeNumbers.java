package practice;
import java.util.*;
public class AverageofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st no.: ");
		int a=sc.nextInt();
		System.out.print("Enter 2nd no.: ");
		int b=sc.nextInt();
		System.out.print("Enter 3rd no.: ");
		int r=sc.nextInt();
		float avg=(a+b+r)/3;
		System.out.println("Average : "+avg);
		
	}

}
