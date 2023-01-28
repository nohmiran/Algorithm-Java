package Baekjoon;

import java.util.Scanner;

public class ex163_Rats {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		int result = (num1 + 1) * (num2 + 1) / (num3 + 1) - 1;

		System.out.print(result);
	}

}
