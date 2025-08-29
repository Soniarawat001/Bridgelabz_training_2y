package lab_practice_1;
import java.util.*;

public class StudenMarks {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        int[][] m = new int[n][3];
	        String[] nm = new String[n];
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter name of student " + (i + 1) + ": ");
	            nm[i] = sc.next();
	            System.out.print("Enter marks in Physics, Chemistry, Maths: ");
	            for (int j = 0; j < 3; j++) {
	                m[i][j] = sc.nextInt();
	            }
	        }
	        
	        for (int i = 0; i < n; i++) {
	            int t = m[i][0] + m[i][1] + m[i][2];
	            double p = t / 3.0;
	            char g;
	            if (p >= 90) g = 'A';
	            else if (p >= 75) g = 'B';
	            else if (p >= 50) g = 'C';
	            else g = 'D';
	            System.out.println(nm[i] + " - Percentage: " + p + " Grade: " + g);
	        }
	        sc.close();
	    }
}
