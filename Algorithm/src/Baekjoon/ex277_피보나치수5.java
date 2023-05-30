package Baekjoon;

import java.util.Scanner;

public class ex277_피보나치수5 {
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int [] arr = new int[num + 1]; // DP문제... 오..

        if (num == 1 || num == 0) {
            System.out.println(num);
            return;
        }

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < num + 1; i++) {
          arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[num]);
      }
}
