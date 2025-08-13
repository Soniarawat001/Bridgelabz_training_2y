package practice;
import java.util.*;
public class KilometerstoMiles {

	public static void main(String[] args) {
		final float n=(float)0.621371;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter kilometers : ");
		float k=sc.nextFloat();
		float m=k*n;
		System.out.print("miles : "+m);
		
	}

}
