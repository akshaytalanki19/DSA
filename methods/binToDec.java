package methods;

import patterns.start;

public class binToDec {
    public static void main(String[] args) {
        int binNum=1010;
        System.out.println("The decimal number of the binary represntation: "+binNum+" = "+deci(binNum));
    }
    public static int deci(int n)
    {
        int pow=0;
        int dec=0;
        while(n>0)
        {
            int last=n%10;
            dec=dec+(last*(int)Math.pow(2,pow));
            pow++;
            n/=10;
        }
        return dec;
    }
}
