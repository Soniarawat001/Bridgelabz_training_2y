package practice;
import java.util.*;
public class TriArea {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        double b = in.nextDouble();
	        double h = in.nextDouble();
	        double areaCm = 0.5 * b * h;
	        double areaIn = areaCm / 6.4516;
	        System.out.println("The area of triangle in cm² is " + areaCm + " and in in² is " + areaIn);
	        in.close();
	}

}
