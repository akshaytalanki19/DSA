package loops;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0&& n!=2)
         System.out.println("Not a prime number");

        else{
            boolean flag=true;
        for(int i=3;i<Math.sqrt(n);i+=2){
           if(n%i==0){
           flag=false;
           break;
           }
        }
        if(flag){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not an prime number");
        }
        }

    }
}
