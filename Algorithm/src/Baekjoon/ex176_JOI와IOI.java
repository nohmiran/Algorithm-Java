package Baekjoon;

import java.util.Scanner;

public class ex176_JOI와IOI {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int JOI = 0;
		int IOI = 0;

		for (int i = 0; i < str.length() - 2; i++) {

			switch (str.charAt(i)) {

			case 'J': // J가 있을 때
				if (str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') { // J다음 O 그 다음 I인게 있다면
					JOI++; // JOI count수를 +1

					break;
				}
			case 'I': // I가 있을 때
				if (str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I') {// I다음 O 그 다음 I인게 있다면
					IOI++; // IOI count수를 +1
				}
			}
		}
		System.out.println(JOI);
		System.out.println(IOI);
	}
}
