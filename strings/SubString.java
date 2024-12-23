package strings;

public class SubString {
    public static void main(String[] args) {
        String str="akshay";
        System.out.println(subString(str, 2, 4));
        System.out.println(str.substring(0, 5));

    }
    public static String subString(String s,int si,int ei)
    {
        String str="";
        for(int i=si;i<ei;i++)
        {
            str+=s.charAt(i);
        }
        return str;
    }
}
