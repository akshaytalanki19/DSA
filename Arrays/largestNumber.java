import java.util.*;
public class largestNumber {
    public static void main(String[] args) {
        int a[]={1,2,6,3,5};
        int largest=getLargest(a);
        System.out.println(largest);
        int small=getSmallest(a);
        System.out.println(small);
    }
    public static int getLargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(largest<number[i])
            {
                largest=number[i];
            }
        }
        return largest;
    }
    public static int getSmallest(int number[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(small>number[i])
            {
                small=number[i];
            }
        }
        return small;
    }
}
