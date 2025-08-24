package practice;
import java.util.*;
public class FeetToMiles {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        double ft = in.nextDouble();
	        double yd = ft / 3;
	        double mi = yd / 1760;
	        System.out.println("The distance is " + ft + " feet, which is " + yd + " yards and " + mi + " miles");
	        in.close();
	}

}
