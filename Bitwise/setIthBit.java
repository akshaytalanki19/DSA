package Bitwise;

public class setIthBit {
    public static void main(String[] args) {
        int n=10;
        int posi=2;
        int bitmask=1<<posi;
        System.out.println(n|bitmask);
    }
}
