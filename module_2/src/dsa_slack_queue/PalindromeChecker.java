package dsa_slack_queue;

import java.util.Scanner;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class PalindromeChecker {
    public static void main(String[] args) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi cần kiểm tra : ");
        String string = sc.nextLine();
        String string1 = string.replaceAll(" ", "").toLowerCase();
        for (int i = 0; i < string1.length(); i++) {
            char char1 = string1.charAt(i);
            queue.add(char1);
            stack.push(char1);
        }
        boolean flag = true;
        while (!queue.isEmpty()) {
            char char2 = queue.remove();
            char char3 = stack.pop();
            if (char2 != char3) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(string + " : là chuỗi Palindrome.");
        } else {
            System.out.println(string + " không phải là chuỗi Palindrome.");
        }
    }
}



