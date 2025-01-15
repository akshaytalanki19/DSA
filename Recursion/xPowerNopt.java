package Recursion;

public class xPowerNopt {
    public static void main(String[] args) {
        System.out.println(powerN(5, 3));
    }
    public static int powerN(int x,int n){
        if(n==0)
        return 1;
        int half=powerN(x, (n/2))*powerN(x, (n/2));
        if(n%2==0)
        {
            return half;
        }
        return half*x;
    }
}
