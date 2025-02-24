package divideconquer;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={12, 11, 13, 5, 6, 7};
        mergeSorts(arr, 0, arr.length-1);
        printArray(arr);
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSorts(int a[],int si,int ei){
        if(si >= ei){
            return;
        }
         int mid=si+(ei-si)/2;
         mergeSorts(a,si,mid);
         mergeSorts(a,mid+1,ei);
         merge(a,si,mid,ei);
    }
    public static void merge(int a[],int si,int mid,int ei){
          int temp[]=new int[ei-si+1];
          int i=si;
          int j=mid+1;
          int k=0;
          while(i<=mid && j<=ei){
            if(a[i]<a[j]){
                temp[k]=a[i];
                i++;
                k++;
            }
            else{
                temp[k]=a[j];
                j++;
                k++;
            }
          }
          while(i<=mid){
            temp[k++]=a[i++];
          }
          while(j<=ei){
            temp[k++]=a[j++];
          }
          for(k=0, i=si; k<temp.length; k++, i++){
            a[i]=temp[k];
          }
    }
}
