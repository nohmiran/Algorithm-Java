package Baekjoon;

import java.util.Scanner;

public class ex127_배수와약수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0)
				break;

			if (num2 % num1 == 0) { // 약수라면 factor
				System.out.println("factor");
			} else if (num1 % num2 == 0) { // 배수라면 multiple
				System.out.println("multiple");
			} else { // 둘 다 아니라면 neither
				System.out.println("neither");
			}
		}
	}

}
