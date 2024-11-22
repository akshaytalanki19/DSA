public class reverseArray {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        printArr(a);
        reverse(a);
        printArr(a);
        reverseArr(a);
        printArr(a);
    }
    public static void reverse(int a[])
    {
        int n=a.length;
       for(int i=0;i<(n/2);i++)
       {
            int temp=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=temp;
       }
    }
    public static void reverseArr(int a[]){
        int first=0,last=a.length-1;
        while(first<last)
        {
            int temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
    }
    public static void printArr(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
          System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
