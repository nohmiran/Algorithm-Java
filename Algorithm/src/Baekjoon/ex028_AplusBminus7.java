package Baekjoon;

import java.util.Scanner;

public class ex028_AplusBminus7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt(); // 문제 갯수
		
		for(int i = 1; i <= T; i++) { // case#뒤에 붙는 수가 1부터 시작하기 때문에 시작 수를 1로 지정.
			
			int num1 = sc.nextInt(); // 정수 1
			int num2 = sc.nextInt(); // 정수 2
			
			// "Case #i: ~"형식으로 출력
			System.out.println("Case #"+i+": "+(num1+num2)); 
			
		}
		
		
		

	}

}
