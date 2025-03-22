import java.util.Scanner;

public class subSets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=  sc.next();
        findSubSets(s, "", 0);
    }
    public static void findSubSets(String s, String ans,int i){
        //base case
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        //recursive case
        findSubSets(s, ans+s.charAt(i), i+1);
        //no choice
        findSubSets(s, ans, i+1);
    }
}
