import java.util.*;
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){

            if(tokens[i].equals("+") ||
                tokens[i].equals("-") ||
                tokens[i].equals("*") ||
                tokens[i].equals("/")){
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                int result = 0;
                switch(tokens[i]){
                    case "+":
                        result = b + a;
                        break;
                    case "-":
                        result = b - a;
                        break;
                    case "*":
                        result = b * a;
                        break;
                    
                    case "/":
                        result = b / a;
                        break;
                }
                stack.push(String.valueOf(result));
                }
                else{
                    stack.push(tokens[i]);
                }

                
            }

            return Integer.parseInt(stack.pop());
        }
        
    }
