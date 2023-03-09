package array_medthod_java.bai_tap;

import java.util.Scanner;

public class veHinhThoi {

    public static void main(String[] args) {
        char[] letter = {' ', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int letterNumber = 0;
        String[] diamond = new String[26];
        System.out.print("Enter a number(1-9)  : ");
        Scanner reader = new Scanner(System.in);
        try {
            char userLetter = reader.next("[ -Z]").charAt(0);
            for (int i = 0; i < letter.length; i++) {
                if (letter[i] == userLetter) {
                    letterNumber = i;
                    break;
                }
            }

            for (int i = 0; i <= letterNumber; i++) {
                diamond[i] = "";
                for (int j = 0; j < letterNumber - i; j++) {
                    diamond[i] += " ";
                }
                diamond[i] += letter[i];

                if (letter[i] != ' ') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += letter[i];
                }
                System.out.println(diamond[i]);
            }

            for (int i = letterNumber - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
