package practice;
import java.util.*;
public class KmToMi {

	public static void main(String[] args) {
		
	        Scanner in = new Scanner(System.in);
	        double km = in.nextDouble();
	        double mi = km / 1.6;
	        System.out.println("The total miles is " + mi + " mile for the given " + km + " km");
	        in.close();
	}

}
