package SubArray;
import java.util.Scanner;

public class subArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        subSum(a);
        sc.close();
    }
    public static void subSum(int a[]){
        int local=0,global=0;
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                local=0;
                for(int k=i;k<=j;k++)
                {
                   System.out.print(a[k]+" ");
                   local+=a[k];
                }
                System.out.print(" = "+local);
                if(local>global)
                global=local;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("maximum sub aray sum is: "+global);
    }
}
