package Baekjoon;

import java.util.Scanner;

public class ex70_막대기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int count = 0; // 풀로 붙이는 횟수
		int stick = 64; // 막대기의 처음 길이는 64cm

		while (X > 0) {
			if (stick > X) { // 스틱 길이가 X보다 크다면
				
				stick /= 2; // 절반으로 잘라버려
				
			}else { // 스틱 길이가 X보다 작다면
				
				count++; // 풀로 붙이고
				X = X - stick; // X의 길이에서 막대기의 길이만큼 뺴준다
			}
		}
		System.out.println(count);
	}
}
