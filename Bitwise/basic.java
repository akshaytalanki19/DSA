package Bitwise;

public class basic {
    public static void main(String[] args) {
        int x=5,y=6;
        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
        System.out.println(x<<y); // a<<b= a* (2^b)
        System.out.println(x >> y); // a>>b = a/(2^b)
    }
}
