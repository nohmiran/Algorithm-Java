package Baekjoon;

import java.util.Scanner;

public class ex148_주사위게임 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); // 주사위 몇번 굴릴거니
		
		int chang = 100; // 창영이 점수
		int sang = 100; // 상덕이 점수

		for (int i = 0; i < num; i++) {

			int chang_dice = sc.nextInt(); // 창영이 주사위
			int sang_dice = sc.nextInt(); // 상덕이 주사위
			
			if (chang_dice == sang_dice) {

			} else if (chang_dice > sang_dice) {
				
				sang = sang - chang_dice;
				
			} else if (chang_dice < sang_dice) {
				
				chang = chang - sang_dice;
			}
		}

		System.out.println(chang);
		System.out.println(sang);
	}

}
