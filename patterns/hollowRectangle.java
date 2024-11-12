package patterns;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
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
            sc.close();
            
        }
    }
}
