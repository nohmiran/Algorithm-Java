package Baekjoon;

import java.util.Scanner;

public class ex324_성택이의은밀한비밀번호 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			String pw = sc.next();

			if (pw.length() <= 9 && pw.length() >= 6) {
				System.out.println("yes");
			} else
				System.out.println("no");
		}
	}
}
