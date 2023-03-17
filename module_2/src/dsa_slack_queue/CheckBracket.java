package dsa_slack_queue;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            if (char1 == '(') {
                stack.push(char1);
            } else if (char1 == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((char1 == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c) ";
        String string2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String string3 = "s * (s – a) * (s – b * (s – c)";
        String string4 = "s * (s – a) * s – b) * (s – c)";
        System.out.println(string1 + " : " + checkParenthesis(string1));
        System.out.println(string2 + " : " + checkParenthesis(string2));
        System.out.println(string3 + " : " + checkParenthesis(string3));
        System.out.println(string4 + " : " + checkParenthesis(string4));
    }
}
