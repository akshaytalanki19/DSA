package oops;

public class overloading {
    public static void main(String[] args) {
        Caluclator cal=new Caluclator();
        System.out.println(cal.sum(5, 0));
        System.out.println(cal.sum((float)3.7,(float)6.9));
    }
}

class Caluclator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
}