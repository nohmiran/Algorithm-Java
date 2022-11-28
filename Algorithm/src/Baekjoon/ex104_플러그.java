package Baekjoon;

import java.util.Scanner;

public class ex104_플러그 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0;
		int multitap = sc.nextInt();

		for (int i = 0; i < multitap; i++) {
			int plug = sc.nextInt(); // 멀티탭 개수
			sum += plug;
		}
		int computer = sum - (multitap - 1);
		System.out.println(computer);
	}

}
