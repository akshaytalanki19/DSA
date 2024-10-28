public class prime {
    public static void main(String[] args) {
        int num;
        num=107;
        boolean flag=false;
        for(int i=2;i<Math.sqrt(num);i++){
           if(num%i==0)
             flag=true;
        }
        if(flag){
           System.out.print("The given number is not a prime");
        }
        else
        System.out.print("The given number is  a prime");   
    }
}
