package strings;

public class comparision {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");
        if(s1==s2)
        System.out.println("true");
        else
        System.out.println("flase");
        if(s1==s3)
        System.out.println("true");
        else
        System.out.println("flase");
        if(s1.equals(s3))
        System.out.println("true");
        else
        System.out.println("flase");
        if(s1.equals(s2))
        System.out.println("true");
        else
        System.out.println("flase");
    }
}