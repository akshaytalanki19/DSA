package methods;

import java.util.Scanner;

public class caluclator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a * b ="+mul(a,b));
        System.out.println("a / b ="+div(a,b));
        System.out.println("a + b ="+add(a,b));
        System.out.println("a - b ="+sub(a,b));
        sc.close();
    }
    public static int mul(int a,int b)
    {
        return a*b;
    }
    public static int div(int a,int b)
    {
        return a/b;
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a,int b)
    {
        return a-b;
    }
}
