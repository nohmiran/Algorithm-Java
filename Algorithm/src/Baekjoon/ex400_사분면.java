package Baekjoon;

import java.util.Scanner;

public class ex400_사분면 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counts = new int[4];
        int axis = 0; 

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 0 || y == 0) {
                // 축에 속하는 경우
                axis++;
            } else if (x > 0 && y > 0) {
                // 1사분면
                counts[0]++;
            } else if (x < 0 && y > 0) {
                // 2사분면
                counts[1]++;
            } else if (x < 0 && y < 0) {
                // 3사분면
                counts[2]++;
            } else if (x > 0 && y < 0) {
                // 4사분면
                counts[3]++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Q" + (i + 1) + ": " + counts[i]);
        }
        System.out.println("AXIS: " + axis);
    }
}
