package Baekjoon;

import java.util.Scanner;

public class ex333_완전제곱수 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum = 0;
		int min = 0;
        
		for (int i = 1; i <= 100; i++) {
			int temp = i * i; // i의 제곱을 temp에 저장
            
			if (num1 <= temp && temp <= num2 ) { // num1과 num2사이에 완전제곱수가 존재하는 경우
				if (min == 0) { // 최솟값이 없다면
                    min = temp; // temp가 최솟값
                }
				sum += temp;
			}
		}
		if (min == 0) { // 완전제곱수가 존재하지 않는 경우
            System.out.println(-1); // -1 출력
        } else {
			System.out.println(sum); // 완전제곱수의 합
			System.out.println(min); // 최솟값
		}
	}
}
