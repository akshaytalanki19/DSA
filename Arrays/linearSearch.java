public class linearSearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,0};
        int key=5;
        int index=linear(a,key);
        if(index==-1)
        System.out.println("not found");
        else
        System.out.println(index);
    }
    public static int linear(int a[],int key)
    {
         for(int i=0;i<a.length;i++)
         {
            if(a[i]==key)
            return i;
         }
         return -1;
    }
}
