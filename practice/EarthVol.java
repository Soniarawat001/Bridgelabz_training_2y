package practice;

public class EarthVol {

	public static void main(String[] args) {
		 double r = 6378;
	        double pi = Math.PI;
	        double vKm = (4.0 / 3.0) * pi * Math.pow(r, 3);
	        double vMi = vKm / Math.pow(1.609, 3);
	        System.out.println("The volume of earth in cubic kilometers is " + vKm + " and cubic miles is " + vMi);
	   }

}
