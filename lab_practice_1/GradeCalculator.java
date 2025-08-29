package lab_practice_1;

import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[][] m=new int[n][3];
        double[] p=new double[n];
        String[] g=new String[n];
        for(int i=0;i<n;i++){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            if(a<0||b<0||c<0){i--;continue;}
            m[i][0]=a;m[i][1]=b;m[i][2]=c;
            p[i]=(a+b+c)/3.0;
            if(p[i]>=80) g[i]="A";
            else if(p[i]>=70) g[i]="B";
            else if(p[i]>=60) g[i]="C";
            else if(p[i]>=50) g[i]="D";
            else if(p[i]>=40) g[i]="E";
            else if(p[i]<=39) g[i]="R";
        }
        for(int i=0;i<n;i++)
            System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+p[i]+" "+g[i]);
        sc.close();
    }
}
