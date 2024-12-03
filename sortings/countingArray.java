package sortings;

public class countingArray {
    public static void main(String[] args) {
        int a[]={5,1,4,1,3,2,4,3,7};
        counting(a);
        bubbleSort.print(a);
    }
    public static void counting(int a[]){
       int largest =Integer.MIN_VALUE;
       int n=a.length;
       for(int i=0;i<n;i++){
        largest=Math.max(largest,a[i]);
       }
       int count[]=new int[largest+1];
       for(int i=0;i<n;i++)
       {
        count[a[i]]++;
       }
       int j=0;
       for(int i=0;i<count.length;i++)
       {
        while(count[i]>0){
            a[j]=i;
            j++;
            count[i]--;
        }
       }
    }

}
