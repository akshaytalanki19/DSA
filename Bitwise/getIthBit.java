package Bitwise;

public class getIthBit {
    public static void main(String[] args) {
        int n=10;
        int posi=3;
        int bitmask=1<<posi;
        if((n & bitmask)!=0)
        System.out.println(1);
        else
        System.out.println(0);
    }
}
