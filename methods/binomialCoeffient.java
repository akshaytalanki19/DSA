package methods;

import java.util.Scanner;

public class binomialCoeffient {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int frac_n=factorial(n);
        int frac_r=factorial(r);
        int frac_n_r=factorial(n-r);
        System.out.println(frac_n/(frac_r*frac_n_r));
        sc.close();
    }
    public static int factorial(int n)
    {
        int fact=1;
        for(int i=2;i<=n;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
