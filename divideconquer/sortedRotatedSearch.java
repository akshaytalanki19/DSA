package divideconquer;

public class sortedRotatedSearch {
    public static void main(String[] args) {
        int a[]={4,5,6,7,8,9,1,2,3};
        int tar=1;
        System.out.println(search(a, tar, 0, a.length-1));
        System.out.println(searchIterative(a, tar));
    }
    public static int search(int a[],int tar,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        if(a[mid]==tar){
            return mid;
        }
        if(a[si]<=a[mid]){
            if(tar>=a[si] && tar<a[mid]){
               return search(a, tar, si, mid-1);
            } else{
                return search(a, tar, mid+1, ei);
            }
        } else{
            if(a[mid]<=tar && tar<=a[ei]){
                return search(a, tar, mid+1, ei);
            } else{
                return search(a, tar, si, mid-1);
            }
        }
    }
    public static int searchIterative(int a[],int tar){
        int si=0;
        int ei=a.length-1;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(a[mid]==tar){
                return mid;
            }
            if(a[si]<=a[mid]){
                if(tar<=a[mid] && tar>=a[si]){
                    ei=mid-1;
                } else{
                    si=mid+1;
                }
            } else{
                if(tar<=a[mid] && tar<=a[ei]){
                    si=mid+1;
                } else{
                    ei=mid-1;
                }
                }
            
        }
        return -1;
    }
}

