package Baekjoon;

import java.util.Scanner;

public class ex039_최댓값 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[9]; // 9개 칸 생성
		int max = 0; // 최댓값

		int index = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt(); // 입력하는 수를 num[i]에 각각 저장하고
			
			if (num[i] > max) {

				max = num[i]; // num[i]가 max보다 크면 max에 담아준다

				index = i; // 그리고 i번째의 수를 index라는 변수에 넣어준다
			}
		}
		System.out.println(max); // 큰 수는 max이고
		System.out.println(index+1); // max가 담긴 index수를 출력.
	}
}
