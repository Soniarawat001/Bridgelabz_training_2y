package lab_practice_1;
import java.util.*;

class BmiCalculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] d = new double[n][3];
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            double w = sc.nextDouble();
            double h = sc.nextDouble();
            if(w<=0||h<=0){i--;continue;}
            d[i][0]=w;
            d[i][1]=h;
            d[i][2]=w/(h*h);
            if(d[i][2]<18.5) s[i]="Underweight";
            else if(d[i][2]<25) s[i]="Normal";
            else if(d[i][2]<30) s[i]="Overweight";
            else s[i]="Obese";
        }
        for(int i=0;i<n;i++)
            System.out.println(d[i][0]+" "+d[i][1]+" "+d[i][2]+" "+s[i]);
        sc.close();
    }
}
