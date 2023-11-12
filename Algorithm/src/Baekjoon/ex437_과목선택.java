package Baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class ex437_과목선택 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //물리
        int B = sc.nextInt(); //화학
        int C = sc.nextInt(); //생물
        int D = sc.nextInt(); //지구과학

        int[] total = new int[] {A, B, C, D};
        Arrays.sort(total);
        int sum1 = total[1] + total[2] + total[3];

        int E = sc.nextInt(); //역사
        int F = sc.nextInt(); //지리

        int sum2 = Math.max(E, F);

        System.out.println(sum1 + sum2);
    }
}
