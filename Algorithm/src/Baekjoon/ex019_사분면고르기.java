package Baekjoon;

import java.util.Scanner;

public class ex019_사분면고르기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0) { // x가 음수일 때 
			if (y > 0) { // y가 음수이면
				System.out.println(1); // 1사분면
			} else { // y가 양수이면
				System.out.println(4); // 4사분면
			}
		} else { // x가 양수일 때
			if (y > 0) { // y가 양수이면
				System.out.println(2); // 2사분면
			} else { // y가 음수이면
				System.out.println(3); // 3사분면
				}
		}
	}
}
