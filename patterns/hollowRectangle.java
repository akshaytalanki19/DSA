package patterns;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            hollowRectangleStar(n);
            hollow_rectangle(n, n+1);
            sc.close();
            
        }
    public static void hollow_rectangle(int toRows,int toCols)// apna clg
    {
        for(int i=1;i<=toRows; i++)
        {
            for(int j=1;j<=toCols;j++)
            {
                if(i==1 || i==toRows || j==1 || j==toCols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowRectangleStar(int n)  //by me
    {
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==n)
            {
                for(int j=0;j<=n;j++)
                {
                   System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int j=0;j<=n;j++)
                {
                    if(j==0||j==n)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
    }
}
}