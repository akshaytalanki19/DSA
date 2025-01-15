package Recursion;

public class xPowerN {
    public static void main(String[] args) {
        System.out.println(power(5,3));
    }
    public static int power(int x,int n){
        if(n==0)
        return 1;
        if(n==1)
        return x;
        return x*power(x,n-1);
    }
}
