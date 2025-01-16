package Recursion;

public class paring {
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
    public static int friendsParing(int n){
        if(n<=2)
        return n;
        int m=friendsParing(n-1);
        return m+(m*friendsParing(n-2));
    }
}
