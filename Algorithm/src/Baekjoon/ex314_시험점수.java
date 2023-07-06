package Baekjoon;

import java.util.Scanner;

public class ex314_시험점수 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        int minScore = 0; // 민국이 점수 입력
        for (int i = 0; i < 4; i++) {
            minScore += sc.nextInt();
        }
        
        int manScore = 0; // 만세 점수 입력
        for (int i = 0; i < 4; i++) {
            manScore += sc.nextInt();
        }
        // 민국이의 총점과 만세의 총점 중에서 큰 점수를 출력
        System.out.println(Math.max(minScore, manScore));
    }
}
