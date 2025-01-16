package Recursion;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="akshay";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean[26]);
    }
    public static void removeDuplicates(String str, int idx, StringBuilder newsttr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newsttr);
            return;
        }
        char currChar =str.charAt(idx);
        if(map[currChar-'a']==true){
            removeDuplicates(str, idx+1, newsttr, map);
        }
        else {
            map[currChar-'a']=true;
            removeDuplicates(str, idx+1, newsttr.append(currChar), map);
        }
    }
}
