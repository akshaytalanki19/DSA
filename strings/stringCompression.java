package strings;

public class stringCompression {
    public static void main(String[] args) {
        String s="aabbbbcccccdddd";
        System.out.println(compress(s));
    }
    public static String compress(String str){
        String s="";
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            s+=str.charAt(i);
            if(count>1)
            s+=count.toString();
        }
        return s;
    }
}
