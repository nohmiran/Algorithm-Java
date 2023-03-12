package Baekjoon;

import java.util.Scanner;

public class ex207_남욱이의닭장 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			int leg = sc.nextInt(); // 닭의 다리 개수
			int chicken = sc.nextInt(); // 닭 마리 수

			int loseLeg = chicken * 2 - leg; // 다리가 잘린 닭의 수
			int normaChicken = chicken - loseLeg; // 멀 쩡한 닭의 수

			System.out.println(loseLeg + " " + normaChicken);
		}

	}

}
