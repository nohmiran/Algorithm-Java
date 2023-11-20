package Baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex443_배수들의합 {

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = str.nextInt();
        int m = str.nextInt();
        int sum = 0;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = str.nextInt();
        }

        List<Integer> array = new ArrayList<Integer>();

        for (int i : arr) {
            for (int j = 1; i * j <= n; j++) {
                if (!array.contains(i * j)) {
                    array.add(i * j);
                }
            }
        }

        for (int i : array) {
            sum += i;
        }

        System.out.println(sum);
    }
}
