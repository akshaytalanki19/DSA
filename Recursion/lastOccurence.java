package Recursion;

public class lastOccurence {
    public static void main(String[] args) {
        int a[]={2,3,4,5};
        System.out.println(lstOcu(a, 0, 5));
    }
    public static int lstOcu(int a[],int i,int key){
        if(i==a.length-1)
        return -1;
        int isFound =lstOcu(a, i+1, key);
        if(isFound!=-1 && a[i]==key)
        return i;
        return isFound;
    }
}
