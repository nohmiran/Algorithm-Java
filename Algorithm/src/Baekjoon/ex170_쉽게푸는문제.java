package Baekjoon;

import java.util.Scanner;

public class ex170_쉽게푸는문제 {
	public static void main(String[] args) {

		// 동호 이자식 내가 풀어주니까 쉽게 푸는 문제겠지 씨 난 머리 졸라 마니 굴려서 겨우 풀어냈음.. ㅡㅡ
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(); // 시작을 나타내는 정수
		int b = sc.nextInt(); // 끝을 나타내는 정수

		int[] arr = new int[b]; // b만큼의 배열칸 생성
		int index = 0;

		for (int i = 0; i <= b; i++) {
			for (int j = 0; j < i; j++) {
				// 1은 한 번, 2는 두 번, 3은 세 번
				// index와 끝 수가 같으면 break!
				if (index == b) { 
					break;
				}
				arr[index++] = i; // 결국 index수와 arr안에 채워지는 i의 수는 같도록
			}
		}
		
		int result = 0;
		
		// 수열에서 a번째 숫자부터 b번째 숫자까지의 합
		for (int i = a; i <= b; i++) {
			result += arr[i - 1];
		}
		System.out.println(result);
	}

}
