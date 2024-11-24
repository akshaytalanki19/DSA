package SubArray;

public class kadanesSubArray {
    public static void main(String[] args) {
        int a[]={-2,-4,-6,-8,-10};
        kadane(a);
    }
    public static void kadane(int a[]){
        int n=a.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++)
        {
            cs=cs+a[i];
           
            ms=Math.max(cs, ms);
            if(cs<0)
            cs=0;
        }
        System.out.println(ms);
    }
}
