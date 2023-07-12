package Baekjoon;

import java.util.Scanner;

public class ex319_분산처리 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int result = 1;
            for (int j = 0; j < num2; j++) {
                result = (num1 * result) % 10;
            }

            if (result == 0) {
                result = 10;
            }
            System.out.println(result);
        }
    }
}
