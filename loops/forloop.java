package loops;

import java.util.*;

public class forLoop {
    public static void main(String[] args){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of n numbers: "+""+sum);
    }
}
