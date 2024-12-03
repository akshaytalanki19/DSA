package sortings;

public class insertionSort {
    public static void main(String[] args) {
        int a[]={5,4,1,3,1};
        insertion(a);
        bubbleSort.print(a);
    }
    public static void insertion(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int curr=i;
            int prev=i-1;
            while(prev>=0 && a[prev]>a[curr]){
                a[prev+1]=a[prev];
                prev--;
            }
            a[prev+1]=curr;

        }
    }
}
