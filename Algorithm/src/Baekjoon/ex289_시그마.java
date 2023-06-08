package Baekjoon;

import java.util.Scanner;

public class ex289_시그마 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		long num1 = sc.nextLong();
		long num2 = sc.nextLong();
		long sum = 0;

		sum = (Math.max(num1, num2) - Math.min(num1, num2) + 1) * (num1 + num2) / 2;
		
		System.out.println(sum);
	}
}
