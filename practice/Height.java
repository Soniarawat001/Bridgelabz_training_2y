package practice;
import java.util.*;
public class Height {

	public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
    double cm = in.nextDouble();
    double inch = cm / 2.54;
    int ft = (int)(inch / 12);
    double remInch = inch % 12;
    System.out.println("Your Height in cm is " + cm + " while in feet is " + ft + " and inches is " + remInch);
    in.close();
	}

}
