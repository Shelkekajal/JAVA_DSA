import java.util.*;
public class s5{
    public static String reverseString(String str){
        Stack<Character>s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
           char curr= s.pop();
           result.append(curr);
        }
        return result.toString();
    }
    public static void main(String args[]){
        // Stack<Character> s=new Stack<>();
        // s.push('a');
        // s.push('b');
        // s.push('c');
        // while(!s.isEmpty()){
        //     System.out.print(s.pop());
        // }
        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
            }
}