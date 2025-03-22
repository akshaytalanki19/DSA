public class permuntation {
    public static void main(String[] args) {
        String s = "abc";
        findPermutations(s, "");
    }
    public static void findPermutations(String s,String ans){
        //base case
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            String str=s.substring(0, i) +s.substring(i+1);
            findPermutations(str, ans+c);
        }
    }
}
