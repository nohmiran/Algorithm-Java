package Baekjoon;

import java.util.Scanner;

public class ex485_출석이벤트 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int price = sc.nextInt();
		int result = 0;
		
		if (num < 5) {
			result = price;
		}
		if (num >= 5) {
			result = price - 500;
		}
		if (num >= 10) {
			result = Math.min(result, price - price / 10);
		}
		if (num >= 15) {
			result = Math.min(result, price - 2000);
		}
		if (num >= 20) {
			result = Math.min(result, price - price / 4);
		}
		if (result < 0) {
			result = 0;
		}
		System.out.println(result);
	}
}
