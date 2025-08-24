package practice;
import java.util.*;
public class BuyTotal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        double total = price * qty;
        System.out.println("The total purchase price is INR " + total + " if the quantity " + qty + " and unit price is INR " + price);
        sc.close();
	}

}
