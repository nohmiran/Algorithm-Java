package Baekjoon;

import java.util.Scanner;

public class ex465_타일채우기4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long m = sc.nextLong();

        if (n == 1 && m == 1) {
            System.out.println(0);
        } else {
            if (n == 1) {
                System.out.println(m / 2);
            } else if (m == 1) {
                System.out.println(n / 2);
            } else {
                if (m % 2 != 0) {
                    System.out.println(n * (m / 2) + n / 2);
                } else {
                    System.out.println(n * (m / 2));
                }
            }
        }
    }
}
