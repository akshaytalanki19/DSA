package patterns;

import java.util.Scanner;

public class rotatedPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        inverted(n);
        rotated(n);
        sc.close();
    }
    public static void rotated(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>0;j--)
            {
               if(j>i)
               System.out.print(" ");
               else
               System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted(int n)
    {

    }
}
