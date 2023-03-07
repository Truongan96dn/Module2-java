package loop_array_java.bai_tap;

public class HienThi20SoNT {
    public static void main(String[] args) {
        int  n = 2;
        int countPrime = 0 ;
        while ( countPrime < 20){
            int count = 0 ;
            for (int i = 1; i <= n; i++) {
                if(n%i == 0 ){
                    count += 1 ;
                }
            }
            if (count == 2 ){
                countPrime++;
                System.out.println(n);
            } n++;
        }
    }
}
