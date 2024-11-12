package patterns;

import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
        for(int i=1;i<=(n/2);i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i || i+j>n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=(n/2);i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i || i+j>n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }else{
        for(int i=1;i<=(n/2);i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i || i+j>n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=(n/2)+1;i>=1;i--)
        {
            for(int j=1;j<=n;j++)
            {
                if(j<=i || i+j>n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
    }
}


// import java.util.Scanner;

// public class ButterflyPattern {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the butterfly pattern (n): ");
//         int n = sc.nextInt();

//         // Print upper half of the butterfly
//         for (int i = 1; i <= n; i++) {
//             // Left part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             // Space between the two wings
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print("  ");
//             }
//             // Right part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         // Print lower half of the butterfly
//         for (int i = n; i >= 1; i--) {
//             // Left part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             // Space between the two wings
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print("  ");
//             }
//             // Right part
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }