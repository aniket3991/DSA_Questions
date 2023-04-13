package easy;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            /*char ch = s.charAt(i);
            
            if(ch == '(' || ch == '{' || ch == '['){
                parentheses.add(ch);
            }else {
                if(parentheses.isEmpty())
                    return false;
                char check = parentheses.pop();
                if(ch == ')' && check == '(') {
                } else if(ch == ']' && check == '[') {
                } else if(ch == '}' && check == '{') {
                } else
                    return false;
            }*/
            
            switch(s.charAt(i)) {
                case '(':
                case '{':
                case '[':
                    parentheses.push(s.charAt(i));
                    break;
                    
                case ')':
                    if(parentheses.isEmpty() || parentheses.pop() != '(')
                        return false;
                    break;
                    
                case '}':
                    if(parentheses.isEmpty() || parentheses.pop() != '}')
                        return false;
                    break;
                    
                case ']':
                    if(parentheses.isEmpty() || parentheses.pop() != ']')
                        return false;
                    break;
            }
        
        }
        return parentheses.isEmpty();
    }
    
    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("((()))"));
    }
}