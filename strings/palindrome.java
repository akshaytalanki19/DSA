package strings;


public class palindrome {
    public static void main(String[] args) {
        String s="racecar";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i) != str.charAt(n-i-1))
            return false;
        }
        return true;
    }
}
