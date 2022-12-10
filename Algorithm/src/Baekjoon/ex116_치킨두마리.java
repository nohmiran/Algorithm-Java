package Baekjoon;

import java.util.Scanner;

public class ex116_치킨두마리 {

	public static void main(String[] args) {
		
		// 욱제쓰 두 통장의 잔고와 치킨 한 마리의 가격이 주어질 때, 욱제가 치킨 두 마리(...)를 살 수 있는지
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt(); // 욱제쓰 통장 1
		int num2 = sc.nextInt(); // 욱제쓰 통장 2
		
		int 치킨 = sc.nextInt(); // 치킨 값
		int result = num1 + num2; // 두 개의 통장 잔고를 더한 값
		
		// 통장 잔고가 치킨 두 마리 값보다 같거나 많으면 치킨을 산 거스름 돈을 출력
		if(result >= 치킨 * 2) System.out.println(result - (치킨 * 2));
		// 통장 잔고가 치킨 두 마리 값보다 적으면 잔고만 출력 ㅠ 욱제쓰,, 치킨 못무거서 어쩌누,,
		if (result < 치킨 * 2) System.out.println(result);

	}

}
