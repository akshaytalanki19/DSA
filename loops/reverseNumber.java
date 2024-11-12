package loops;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=0;
        while(n>0){
            int temp=n%10;
            m=(m*10)+temp;
            n=n/10;
        }
        System.out.println(m);
        sc.close();
    }
    
}
