package dsa_slack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Stack binaryStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thập phân cần đổi : ");
        int decimalNum = sc.nextInt();
        while (decimalNum != 0) {
            int remainer = decimalNum % 2;
            binaryStack.push(remainer);
            decimalNum /= 2;
        }
        System.out.println("Số nhị phân của số cần tìm là : ");
        while (!binaryStack.empty()) {
            System.out.println(binaryStack.pop());
        }
    }
}
