import java.util.Scanner;

public class trappingRainWater {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a[]=new int[7];
    for(int i=0;i<7;i++)
    a[i]=sc.nextInt();
    sc.close();
    System.out.println(trappingRain(a));
    }
    public static int trappingRain(int a[]){
        int leftMax[]=new int[a.length];
        int rightMax[]=new int[a.length];
        leftMax[0]=a[0];
        for(int i=1;i<a.length;i++){
           leftMax[i]=Math.max(leftMax[i-1],a[i]);
        }
        rightMax[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],a[i]);
        }
        int trappedWater=0;
        for(int i=0;i<a.length;i++)
        {
           trappedWater+=Math.min(leftMax[i],rightMax[i])-a[i]>0?Math.min(leftMax[i],rightMax[i])-a[i]:0;
        }
        return trappedWater;
    }
}

