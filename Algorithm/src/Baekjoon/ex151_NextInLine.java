package Baekjoon;

import java.util.Scanner;

public class ex151_NextInLine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 첫째의 나이를 구하는 문제
		// 1. 첫째 둘째 셋째의 나이 터울은 같다.
		// 2. 둘째와 셋째의 나이는 안다.
		// -> 둘째나이 - 셋째나이 = 나이 터울
		// -> 둘째나이 + 둘째와 셋째의 나이 터울 == 첫째 나이
		
		int age3 = sc.nextInt();
		int age2 = sc.nextInt();
		int age1 = age2 + (age2 - age3);
		
		System.out.println(age1);
	}

}
