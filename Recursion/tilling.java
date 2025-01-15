package Recursion;

public class tilling {
    public static void main(String[] args) {
        System.out.println(tillingProblem(5));
    }
    public static int tillingProblem(int n){
        if(n==0 || n==1)
        return 1;
        int verti=tillingProblem(n-1);
        int hori=tillingProblem(n-2);
        return verti+hori;
    }
}
