package Baekjoon;

import java.util.Scanner;

public class ex097_검증수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sum = 0; // 더해질 수를 담을 변수 상자 하나 만들어주고,

		for (int i = 0; i < 5; i++) {

			int num = sc.nextInt(); // 5개 수 입력!

			sum += num * num; // 입력된 5개의 수를 각각 제곱해준다
		}
		int result = sum % 10; // 제곱된 수를 누적해서 더해준 놈을 또 10으로 나눠 나머지를 result에 담아준다
		
		System.out.println(result); // 나머지(=검증 수) 출력

	}

}
