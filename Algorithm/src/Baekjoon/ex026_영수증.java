package Baekjoon;

import java.util.Scanner;

public class ex026_영수증 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt(); // 영수증에 적힌 총 금액
		int num = sc.nextInt(); // 구매한 물건 종류 수

		int price = 0;
		int number = 0;
		int result = 0;
		// price : 가격, number : 갯수, result : 계산결과 저장

		for (int i = 0; i < num; i++) { // i는 물건의 갯수만큼만 입력받는다
			price = sc.nextInt();
			number = sc.nextInt();

			result += (price * number);
		}
		if (sum == result) { // 영수증에 적힌 총 금액과 합이 같으면
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
