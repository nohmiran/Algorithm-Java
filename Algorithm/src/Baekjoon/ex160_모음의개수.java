package Baekjoon;

import java.util.Scanner;

public class ex160_모음의개수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {

			String str = sc.nextLine();
			int count = 0;

			if (str.equals("#")) {
				break;
			}
			for (int i = 0; i < str.length(); i++) {

				if (str.charAt(i) == 'a' 
						|| str.charAt(i) == 'e' 
						|| str.charAt(i) == 'i' 
						|| str.charAt(i) == 'o'
						|| str.charAt(i) == 'u' 
						|| str.charAt(i) == 'A' 
						|| str.charAt(i) == 'E' 
						|| str.charAt(i) == 'I'
						|| str.charAt(i) == 'O' 
						|| str.charAt(i) == 'U') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
