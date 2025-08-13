package practice;

import java.util.Scanner;

import java.util.*;
public class VolumeofCylinder {

	public static void main(String[] args) {
		final float pi=(float) 3.14;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius of Cylinder: ");
		float r = sc.nextFloat();
		System.out.println("Enter Height of Cylinder: ");
		float h = sc.nextFloat();
        float volume =  pi* r * r*h;
        System.out.printf("Volume of cylinder is: "+volume);


	}

}
