package basic;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str="{(a,b}";
        System.out.println(balancedParentheses(str));
    }

    private static boolean balancedParentheses(String str) {
        Stack<Character> stack = new Stack<>();

        for(char ch: str.toCharArray()){
            if(ch=='[' || ch=='{' || ch=='('){
                stack.push(ch);
            } else if(ch==']'){
                if(stack.isEmpty() || stack.pop() !='[')
                    return false;
            } else if(ch=='}'){
                if(stack.isEmpty() || stack.pop()!='{')
                    return false;
            } else if(ch==')'){
                if(stack.isEmpty() || stack.pop()!='(')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
