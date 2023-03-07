package array_medthod_java.bai_tap;
import java.util.Arrays;
import java.util.Scanner;
public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập vào phần tử cần xoá : ");
        int delX = input.nextInt();
        int[] array = {1,2,4,5,6,7,5,9,0,0};
        for (int i = 0; i < array.length ; i++) {
            if(array[i]== delX){
                System.out.println(" Vị trí của phần tử cần tìm là : "  +i);
                for (int j = i; j < array.length -1 ; j++) {
                    array[j]= array[j+1];
                    array[array.length -1] = 0 ;
                }
            }
        }
        System.out.println(Arrays.toString(array));

    }

}
