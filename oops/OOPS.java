package oops;

public class OOPS {
   public static void main(String[] args) {
     Pen p=new Pen();
     p.setColor("blue");
     p.setTip(5);
     System.out.println(p.color+" "+p.tip);
   } 
}

class Pen{
    String color;
    int tip;
    void setTip(int newTip){
       tip=newTip;
    }
    void setColor(String newColor){
        color=newColor;
    }
}
