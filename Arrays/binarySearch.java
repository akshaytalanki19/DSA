public class binarySearch {
    //The array shoud always be sorted for binary search to work
    // time complexity is o(log(n))
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int index=Search(a, 0);
        System.out.println(index);
    }
    public static int Search(int a[],int key)
    {
        int first=0;
        int last=a.length-1;
       
        while(first<last){
            int mid=(first+last)/2;
            if(a[mid]<key){
                first=mid+1;
            }
            else if(a[mid]>key)
            {
              last=mid-1;
            }
            else if(a[mid]==key)
            {
               return mid; 
            }
        }
        return -1;
    }
}
