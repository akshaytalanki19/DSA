package sortings;

public class selectionSort {
    public static void main(String[] args) {
        int a[]={5,4,1,3,2};
        selection(a);
        bubbleSort.print(a);
    }
    public static void selection(int a[]){
        int n=a.length;
        for(int i=0;i<n-1;i++)
        {
            int minPos=i;
            for(int j=i+1;j<n;j++){
                if(a[minPos]>a[j]){
                    minPos=j;
                }
            }
            if(minPos!=i){
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
            }
        }
    }
}
