package Baekjoon;

import java.util.Scanner;

public class ex118_369 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt(); // 369게임을 숫자 몇까지 할건지 
		int count = 0; // 세어질 수를 담을 변수
		
		for (int i = 1; i <= number; i++) { // 1부터 게임 시작~ number까지!
			
			int temp = i; // 3, 6, 9가 포함된 수가 아니라면 담아질 temp
			
			while (temp != 0) {
				
				if(temp % 10 == 3 || temp % 10 == 6 || temp % 10 == 9)  
					count++;
				temp /= 10; 
			}
		}
		System.out.println(count);
	}
}
