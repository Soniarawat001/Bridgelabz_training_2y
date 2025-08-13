package practice;
import java.util.*;
public class AreaofCircle {
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Radius of Circle: ");
			final float pi=(float) 3.14;
			float r = sc.nextFloat();
	        float Area =  pi* r * r;
	        System.out.printf("Ara of the circle is: "+Area);

	}
}
