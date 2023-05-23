package Baekjoon;

import java.util.Scanner;

public class ex269_준석이의사탕사기 {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 사탕 묶음 개수

        int candy = 0; // 한 번에 가져갈 수 있는 사탕 개수
        int sum = 0; // 최대로 가져갈 수 있는 사탕 개수
        int min = 1001; // 홀수 사탕 중 가장 작은 값

        for (int i = 0; i < num; i++) {
            candy = sc.nextInt();
            sum += candy;

            if (candy % 2 == 1 && candy < min) {
                min = candy;
            }
        }
        if (sum % 2 == 0) {
            System.out.println(sum);
        } if(sum % 2 == 1) {
            System.out.println(sum - min);
        }
    }
}
