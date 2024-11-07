package loops;

import java.util.Scanner;

public class doWhile {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }while(i<=n);
    }
}
