package Baekjoon;

import java.util.Scanner;

public class ex356_PreviousLevel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {

            int level = sc.nextInt();

            if (level < 250) {
                System.out.println("4");
            } else if (level < 275) {
                System.out.println("3");
            } else if (level < 300) {
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
    }
}
