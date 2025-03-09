package divideconquer;

public class quickSort {
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6, 7};
        quickSorts(arr, 0, arr.length-1);
        mergeSort.printArray(arr);
    }
    public static void quickSorts(int a[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pidc=partition(a,si,ei);
        quickSorts(a,si,pidc-1);
        quickSorts(a,pidc+1,ei);
    }
    public static int partition(int a[],int si,int ei){
        int pivot=a[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(a[j]<=pivot){
                i++;
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        a[ei]=a[i];
        a[i]=temp;
        return i;
    }
}
