package practice;
import java.util.*;
public class CelsiustoFahrenheitConversion {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter temperature in Celsius: ");
        float c = sc.nextFloat();
        float f = (c * 9 / 5) + 32;
        System.out.printf("Temp. in fahrenheit is "+f);
	}

}
