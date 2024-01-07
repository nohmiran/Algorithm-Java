package Baekjoon;

import java.util.Scanner;

public class ex490_3의배수 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt();
		int count = 2;
        int sum = 1;

		for (int i = 9; i < num; i+=3) {
				sum += count;
				count++;
		}
		System.out.println(sum);
	}
}
