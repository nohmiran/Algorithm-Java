package Baekjoon;

import java.util.Scanner;

public class ex574_지각 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int a = sc.nextInt();
            int count = 0;
            if (a == 1) {
                sb.append(0).append("\n");
            }
            else {
                for (int j = 1; a >= j * (j + 1); j++) {
                    count++;
                }
                sb.append(count).append("\n");
            }
        }
        System.out.println(sb);
    }
}
