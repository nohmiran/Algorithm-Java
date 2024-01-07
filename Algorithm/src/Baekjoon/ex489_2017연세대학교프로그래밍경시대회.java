package Baekjoon;

import java.util.Scanner;

public class ex489_2017연세대학교프로그래밍경시대회 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        if (test < 6 || test > 100) {

            System.out.println(0);
            return;
        }
        int count = 0;

        while (test > 0) {
            for (int i = 1; i < (test - 2) / 2; i++) {
                if ((test - 2) - i > 2) {
                    count++;
                }
            }
            test -= 2;
        }
        System.out.println(count);
    }
}
