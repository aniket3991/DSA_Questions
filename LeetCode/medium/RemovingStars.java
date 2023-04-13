package medium;

import java.util.*;

public class RemovingStars {
    public String removeStars(String s) {
        /*Stack<Character> stack = new Stack<>();
        String result = "";
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*')
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        for(int i = 0; i < stack.size(); i++)
            result += stack.get(i);
        return result;*/
         
        char[] result = new char[s.length()];
        int k = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '*')
                k--;
            else
                result[k++] = s.charAt(i);
        }
        return String.valueOf(result, 0, k);
    }
    
    public static void main(String[] args) {
        RemovingStars removingStars = new RemovingStars();
        System.out.println(removingStars.removeStars("abb*cdfg*****x*"));
    }
}
