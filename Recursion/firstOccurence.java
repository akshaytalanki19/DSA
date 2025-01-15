package Recursion;

public class firstOccurence {
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        System.out.println(frstOcu(a,0,5));
    }
    public static int frstOcu(int a[],int i,int key){
        if(a[i]==key)
        return i;
        if(i==a.length-1)
        return -1;
        return frstOcu(a, i+1, key);
    }
}
