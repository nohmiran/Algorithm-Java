package Baekjoon;

import java.util.Scanner;

public class ex226_전자레인지 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fiveMinute = 0;
		int oneMinute = 0;
		int tenSecond = 0;

		int test = sc.nextInt();

		while (test >= 10) {

			if (test >= 300) {

				test -= 300;
				fiveMinute++;

			} else if (test >= 60) {

				test -= 60;
				oneMinute++;

			} else if (test >= 10) {

				test -= 10;
				tenSecond++;
			}
		}
		System.out.println(test == 0 ? fiveMinute + " " + oneMinute + " " + tenSecond : -1);

	}

}
