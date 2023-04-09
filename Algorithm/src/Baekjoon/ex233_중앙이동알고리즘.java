package Baekjoon;

import java.util.Scanner;

public class ex233_중앙이동알고리즘 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = 2; // num이 0일때, 한 변의 점 개수는 2
        for (int i = 1; i <= num; i++) {
            result = (result - 1) + result; // (한 변의 점 개수)제곱
        }
        System.out.println(result * result);
    }
}
