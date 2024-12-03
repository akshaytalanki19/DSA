package sortings;


public class bubbleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubbe(arr);
    }
    public static void bubbe(int a[]){
        for(int turns=0;turns<a.length-1;turns++){
            for(int i=0;i<a.length-1;i++)
            {
                if(a[i]>a[i+1])
                {
                    int temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                }
            }
        }
        print(a);
    }
    public static void print(int a[]){
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}
