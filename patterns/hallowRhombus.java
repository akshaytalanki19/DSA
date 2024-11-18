package patterns;

import java.util.Scanner;

public class hallowRhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                 if(i==0 || i==n-1 || j==1 || j==n){
                    System.out.print("* ");
                 }
                 else
                 System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
