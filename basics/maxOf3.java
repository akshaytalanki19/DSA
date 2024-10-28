public class maxOf3 {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=130;
        c=15;
        System.out.print("The bigger number among a,b,c is: ");
        if(a>b){
           if(a>c)
             System.out.println(a);
            else
              System.out.print(c);
        }else{
            if(b>c)
              System.out.println(b);
            else
              System.out.print(c);
        }
    }
}
