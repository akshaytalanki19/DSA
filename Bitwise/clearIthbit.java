package Bitwise;

public class clearIthbit {
    public static void main(String[] args) {
        int n=10;
        int posi=1;
        int bitmask=~(1<<posi);
        System.out.println(n&bitmask);
    }
}
