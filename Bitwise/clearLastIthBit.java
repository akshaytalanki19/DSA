package Bitwise;

public class clearLastIthBit {
    public static void main(String[] args) {
        int n=10;
        int posi=2;
        int bitmask = (~0)<<posi;
        System.out.println(n&bitmask);
    }
}
