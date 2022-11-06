package Baekjoon;

import java.util.Scanner;

public class ex84_손익분기점 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // 불변비용
		int b = sc.nextInt(); // 가변 비용
		int c = sc.nextInt(); // 상품 가격

		int result;

		if (b >= c) {
			result = -1; // 손익 분기점이 존재하지 않으면 -1
		} else { // 생활체조 법칙,, else쓰지 않긔,,ㅠ
			result = (a / (c - b)) + 1; // 최초로 이익이 발생하는 판매량
		}
		System.out.println(result);
	}

}
