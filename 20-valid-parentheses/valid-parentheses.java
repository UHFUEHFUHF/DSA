import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        String open = "({[";
        for(char ch : s.toCharArray()){
            if(open.indexOf(ch) != -1){
                stack.push(ch);
            }
            else if(ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if(ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else{
                return false;
            }

            

        }
        return stack.isEmpty();
    }
}