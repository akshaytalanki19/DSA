package methods;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isPlaindrome(n))
        System.out.println("The given number :"+n+" is plaindrome");
        else
        System.out.println("The given number :"+n+" is not plaindrome");
        sc.close();
    }
    public static boolean isPlaindrome(int n)
    {
        int t=n;
        int rev=0;
        while(t>0)
        {
            int temp=t%10;
            rev=(rev*10)+(temp);
            t=t/10;
        }
        if(rev==n)
        return true;
        else
        return false;
    }
}
