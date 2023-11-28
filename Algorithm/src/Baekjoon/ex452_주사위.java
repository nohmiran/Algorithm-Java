package Baekjoon;

import java.util.*;

public class ex452_주사위 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sides1 = sc.nextInt(); // 주사위 1의 면 수
        int sides2 = sc.nextInt(); // 주사위 2의 면 수
        int sides3 = sc.nextInt(); // 주사위 3의 면 수
        
        // 각 주사위의 면을 더한 결과를 저장할 배열
        int[] sumArr = new int[301]; // 주사위의 최대 합은 각 주사위의 최대 면 수의 합이므로 100 + 100 + 100 = 300
        
        // 각 주사위의 면을 더한 결과를 배열에 저장
        for (int i = 1; i <= sides1; i++) {
            for (int j = 1; j <= sides2; j++) {
                for (int k = 1; k <= sides3; k++) {
                    sumArr[i + j + k]++;
                }
            }
        }
        
        // 가장 많이 나온 주사위의 합 구하기
        int maxCount = 0;
        int result = 0;
        for (int i = 1; i <= 300; i++) {
            if (maxCount < sumArr[i]) {
                maxCount = sumArr[i];
                result = i;
            }
        }
        System.out.println(result);
    }
}
