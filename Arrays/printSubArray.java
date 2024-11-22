public class printSubArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
         subArray(a);
    }
    public static void subArray(int a[])
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
