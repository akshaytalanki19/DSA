package methods;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(isPrime(i))
            System.out.print(i+" ");

        }
        sc.close();
    }
    public static boolean isPrime(int n)
    {
        if(n==2)
        return true;
        if(n%2==0)
        return false;
        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
