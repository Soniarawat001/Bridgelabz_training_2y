package practice;
import java.util.*;
public class Handshakes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int shake = (n * (n - 1)) / 2;
        System.out.println("The maximum number of possible handshakes is " + shake);
        in.close();
	}

}
