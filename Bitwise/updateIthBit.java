package Bitwise;

public class updateIthBit {
    public static void main(String[] args) {
        int n=10;
        int posi=2;
        int bitmask=~(1<<posi);
        n=n&bitmask;
        int newBit=1;
        bitmask=newBit<<posi;
        System.out.println(n|bitmask);
    }
}
