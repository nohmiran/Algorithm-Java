package Baekjoon;

import java.util.Scanner;

public class ex40_나머지 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int count = 0; // 서로 다른 값이 몇개인지 세기 위한 변수

		int[] arr = new int[10]; // 10개의 배열 칸 생성

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt() % 42;// 입력값을 42로 나눈 나머지만을 arr에 담는다.
		}

		for (int i = 0; i < arr.length; i++) {
			int temp = 0; // 나머지를 비교할 변수
			
			for (int j = i + 1; j < arr.length; j++) { // i칸과 i+1칸과 비교
				if (arr[i] == arr[j]) { // i와 i+1이 같다면 temp++
					temp++;
				}
			}
			if (temp == 0) { // temp가 ++되지 않았다면 (=0이라면) count++
				count++;
			}
		}
		System.out.println(count);
	}
}
