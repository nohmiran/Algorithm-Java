package Baekjoon;

import java.util.Scanner;

public class ex115_수도요금 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int xLiterPay = sc.nextInt(); // x사 1리터 요금
		int yPay = sc.nextInt(); // y사 기본 요금
		int liter = sc.nextInt(); // y사 사용요금이 liter리터라면 기본요금만 청구
		int liter2 = sc.nextInt(); // liter리터가 넘은 경우 1리터 당 liter2원
		int joi = sc.nextInt(); // joi가 한 달간 쓰는 수도 양
		
		int xPay = joi * xLiterPay; // x사 요금
		int result = 0; 
		
		if(joi <= liter) {
			result = yPay;
		}else {
			result = yPay + (joi - liter) * liter2;
		}
		if(xPay > result) {
			System.out.println(result);
		}else {
			System.out.println(xPay);
		}
	}

}
