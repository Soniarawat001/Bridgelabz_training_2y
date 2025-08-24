package practice;
import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double peri = in.nextDouble();
        double side = peri / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri);
        in.close();
	}

}
