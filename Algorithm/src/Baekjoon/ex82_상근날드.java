package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class ex82_상근날드 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] burger = new int[3]; // 햄버거 종류의 수
		int[] drink = new int[2]; // 음료 종류의 수

		for (int i = 0; i < burger.length; i++) {

			burger[i] = sc.nextInt();
		}

		for (int i = 0; i < drink.length; i++) {

			drink[i] = sc.nextInt();
		}

		// 오름차순 정렬
		Arrays.sort(burger);
		Arrays.sort(drink);

		// 제일 싼 햄버거와 제일 싼 음료수 가격을 더하고 -50원 할인
		System.out.println(burger[0] + drink[0] - 50);
	}

}
