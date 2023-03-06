package introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSo {
    public static String HangDonVi(int n) {
        switch (n) {
            case 1:
                return " One";
            case 2:
                return " Two";
            case 3:
                return " Three";
            case 4:
                return " Four";
            case 5:
                return " Five";
            case 6:
                return " Six";
            case 7:
                return " Seven";
            case 8:
                return " Eight";
            case 9:
                return "Night";
            default:
                return "";
        }
    }

    public static String BeHon20(int n) {
        int number = n % 10;
        switch (number) {
            case 0:
                return "Ten ";
            case 1:
                return " Eleven";
            case 2:
                return " Twelve";
            case 3:
                return " Thirteen";
            case 4:
                return " FourTeen";
            case 5:
                return " Fifteen";
            case 6:
                return " Sixteen";
            case 7:
                return " SevenTeen";
            case 8:
                return "Eighteen";
            case 9:
                return "NightTeen";
            default:
                return " out of ability";
        }
    }

    public static String HangChuc(int n) {
        int number = n / 10;
        switch (number) {
            case 1:
                return BeHon20(n);
            case 2:
                return " Twenty";
            case 3:
                return " Thirty";
            case 4:
                return " FourTy";
            case 5:
                return " Fifty";
            case 6:
                return " Sixty";
            case 7:
                return " SevenTy";
            case 8:
                return "Eighty";
            case 9:
                return "NightTy";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number : ");
        int number = sc.nextInt();
        System.out.println("Your number is : " + number);
        if (number > 0 && number < 10) {
            String output = HangDonVi(number);
            System.out.println(output);
        } else if (number >= 10 && number < 20) {
            String output = BeHon20(number);
            System.out.println(output);
        } else if (number >= 20 && number < 100) {
            int a = number % 10;
            String output = HangChuc(number) + HangDonVi(a);
            System.out.println(output);
        } else if (number < 1000) {
            int a = number / 100;
            int b = number % 100;
            int c = (number % 100) % 10;
            if (b > 0) {
                String output = HangDonVi(a) + " HUNDRED AND " + HangChuc(b) + HangDonVi(c);
                System.out.println(output);
            } else {
                String output = HangDonVi(a) + " HUNDRED " + HangChuc(b) + HangDonVi(c);
                System.out.println(output);
            }
        }
    }
}