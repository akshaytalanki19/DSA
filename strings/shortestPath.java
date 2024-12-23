package strings;

import java.util.Scanner;

public class shortestPath {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int x=0,y=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='w')
            x--;
            else if(str.charAt(i)=='e')
            x++;
            else if(str.charAt(i)=='s')
            y--;
            else
            y++;
        }
        System.out.println(shortest(x, y));
        sc.close();
    }
    public static int shortest(int x,int y){
        return (int) Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
    }
}
