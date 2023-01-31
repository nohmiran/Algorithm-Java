package Baekjoon;

import java.util.Scanner;

public class ex166_소수찾기 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int question = sc.nextInt(); // 문제 수 입력
		int count = 0;

		for (int i = 0; i < question; i++) {

			int num = sc.nextInt(); // 소수인지 아닌지 밝혀낼 숫자 입력

			for (int j = 2; j <= num; j++) {// 2부터 num까지 나눈다.
				
				if (j == num) { // 만약 j하고 num이 같으면 자기 자신까지 온 거니까 count++ => 소수
					count++;
				}
				if (num % j == 0) {// j와 num이 같지 않았을 때, num을 j로 나눴는데 나머지가 0이라면 break!
					break;
				}
			}
		}
		System.out.println(count);
	}

}
