package strings;

import java.util.Scanner;

class basic
{
   public static void main(String[] args) {
    // char ch[]={'a','b','c','d'};
    // String str = "abcd";
    // String str2 = new String("xyz");
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    System.out.println(s.length());
    String firstName="Akshay";
    String lastName="Kumar";
    String fullName = firstName + " " + lastName ;
    System.out.println(fullName);
    sc.close();
   }
}