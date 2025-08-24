package practice;
import java.util.*;
public class FeeCalc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        double fee = in.nextDouble();
        double off = in.nextDouble();
        double cut = (off / 100) * fee;
        double finalFee = fee - cut;
        System.out.println("The discount amount is INR " + cut + " and final discounted fee is INR " + finalFee);
        in.close();
	}

}
