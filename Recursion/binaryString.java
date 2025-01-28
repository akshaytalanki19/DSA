package Recursion;

public class binaryString {
    public static void main(String[] args) {
        printBinStrings(3, 0, new StringBuilder(""));
    }
    public static void printBinStrings(int n,int last,StringBuilder str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0, str.append("0"));
        if(last == 0){
            printBinStrings(n-1, 1, str.append("1"));
        } 
    }
}
