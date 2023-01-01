package Baekjoon;

import java.util.Scanner;

public class ex137_양수개수세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		// eclipse에서는 돌아가지 않음..!
		// hasNextInt()가 정수만 받는 거기 때문에 문자를 넣어줘야 끝이 남
		while (sc.hasNextInt()) {
			
			int num = sc.nextInt();
			
			if (num > 0) {
				count++;
			}

		}
		System.out.println(count);
	}
}
