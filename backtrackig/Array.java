public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);    
    }
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    public static void changeArr(int a[],int i,int val){
        if(i==a.length){
            printArray(a);
            return;
        }
        a[i]=val;
        changeArr(a, i+1, val+1);
        a[i]=a[i]-2;
    }
}
