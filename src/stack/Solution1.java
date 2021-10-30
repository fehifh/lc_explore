package stack;

import java.util.Stack;

class Solution1 {
    public static boolean isValid(String s) {


        Stack<Character> pairStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!pairStack.isEmpty()) {
                char left = pairStack.peek();
                if ((left == '(' && ch == ')') || (left == '{' && ch == '}') || (left == '[' && ch == ']'))
                    pairStack.pop();
                else pairStack.push(ch);
            } else pairStack.push(ch);
        }
        return pairStack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
        System.out.println(isValid("[]"));
        System.out.println(isValid("]()"));
        System.out.println(isValid("([{)"));
        System.out.println(isValid("]"));
        System.out.println(isValid("]"));
    }
}