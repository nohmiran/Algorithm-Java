package Baekjoon;

import java.util.Scanner;

public class ex149_0notcute1cute {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int cute = 0;
		int notCute = 0;

		for (int i = 0; i < num; i++) {
			if (sc.nextInt() == 1) {
				cute++;
			}else{
				notCute++;
			}
		}
		if (cute > notCute) {
			System.out.println("Junhee is cute!");
		}else{
			System.out.println("Junhee is not cute!");
		}
	}

}
