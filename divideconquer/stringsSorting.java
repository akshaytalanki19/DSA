package divideconquer;

public class stringsSorting {
    public static void main(String[] args) {
        String arr[]=  { "sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
    public static void printArray(String a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void mergeSort(String a[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(a,si,mid);
        mergeSort(a,mid+1,ei);
        merge(a,si,mid,ei);
    }
    public static void merge(String a[],int si,int mid,int ei){
        int i=si;
        int j=mid+1;
        int k=0;
        String temp[]=new String[ei-si+1];
        while(i<=mid && j<=ei){
            if(a[i].compareTo(a[j])<0){
                temp[k++]=a[i++];
            } else{
                temp[k++]=a[j++];
            }
        }
        while(i<=mid){
            temp[k++]=a[i++];
        }
        while(j<=ei){
            temp[k++]=a[j++];
        }
    }
}
