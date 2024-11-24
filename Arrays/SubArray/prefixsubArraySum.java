package SubArray;

import java.util.Scanner;

public class prefixsubArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        prefixSum(a);
        sc.close();
    }
    public static void prefixSum(int a[])
    {
        int n=a.length;
        int pre[]=new int[n];
        pre[0]=a[0];
        int currsum=0,maxsum=0;
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+a[i];
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                  currsum = i==0 ? pre[j] : pre[j]-pre[i-1];
                  if(currsum>maxsum)
                  maxsum=currsum;
            }
        }
        System.out.println("the max sum is: "+maxsum);
    }
}
