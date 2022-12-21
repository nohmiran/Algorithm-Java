package Baekjoon;

import java.util.Scanner;

public class ex096_저작권 {

	public static void main(String[] args) {

		// 창영이 앨범에 포함되어있는 저작권이 있는 멜로디의 평균값 구하는게 문제
		// (창영이 앨범에 수록된 곡에 포함되어 있는 저작권이 있는 멜로디의 개수) / (앨범에 수록된 곡의 개수)
		// 로 구하면 되는데 이때ㅔ, 평균값은 항상 올림을 해서 소수가 아닌 정수로 만들어야한다
		// ex. 38개 곡 중에 저작권이 있는 멜로디가 894개라면
		// 894/38 = 23.53 -> 올림을 해서 24가 답이 된다.

		// 여기서 24는 평균값이니까
		// 저작권이 있는 멜로디를 구하려면
		// (38 * (24-1)) + 1
		// 를 하면 반대로 저작권이 있는 멜로디의 값이 나온다

		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println((num1 * (num2 - 1)) + 1);

	}

}
