package Baekjoon;

import java.util.Scanner;

public class ex310_선물 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int socks = sc.nextInt();
        int[] arr = new int[day];
        for (int i = 0; i < day; i++) {
            arr[i] = sc.nextInt();
        }

        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < day - 1; i++) {
            int num = arr[i] + arr[i+1];
            if (min > num) {
                min = num;
                index = i;
            }
        }
        int result = (arr[index] + arr[index + 1]) * socks;
        System.out.println(result);
    }
}
