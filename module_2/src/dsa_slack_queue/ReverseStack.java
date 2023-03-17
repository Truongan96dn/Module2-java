package dsa_slack_queue;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Mảng trước khi bị đảo ngược : " + Arrays.toString(array));
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("Mảng sau khi đảo ngược : " + Arrays.toString(array));

        Stack<Character> stackStr = new Stack<Character>();
        String string = "TruongAn";
        System.out.println("chuối trước khi chưa đảo ngược : " + string);
        for (int i = 0; i < string.length(); i++) {
            stackStr.push(string.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while (!stackStr.empty()) {
            sb.append(stackStr.pop());
        }
        System.out.println("Chuối sau khi bị đảo ngược là :" + sb);
    }
}
