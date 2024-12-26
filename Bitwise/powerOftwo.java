package Bitwise;

public class powerOftwo {
    public static void main(String[] args) {
        int n=1024;
        if((n&(n-1))==0)
        System.out.println(true);
        else
        System.out.println(false);
    }
}
