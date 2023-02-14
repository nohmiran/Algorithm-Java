package Baekjoon;

import java.util.Scanner;

public class ex179_SiteScore {

	public static void main(String[] args) {
		// 문제에 답이 있다.
		// 입력된 4개의 값에 각각의 수를 곱해주고 모두를 더하면 됨 ㅎ
		// 56UR + 24TR + 14UO + 6TO

		Scanner sc = new Scanner(System.in);
		
		int UR = sc.nextInt();
		int TR = sc.nextInt();
		int UO = sc.nextInt();
		int TO = sc.nextInt();
		
		System.out.println(56 * UR + 24 * TR + 14 * UO + 6 * TO);
	}

}
