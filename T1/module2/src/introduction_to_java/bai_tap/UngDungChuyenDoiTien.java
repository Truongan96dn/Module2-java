package introduction_to_java.bai_tap;
import java.util.Scanner;

public class UngDungChuyenDoiTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input your currency : ");
        int vnd = 23000;
        int usd ;
        usd = Integer.parseInt(input.nextLine());
        int change = vnd * usd ;
        System.out.println(" VND : "+ change);
    }
}
