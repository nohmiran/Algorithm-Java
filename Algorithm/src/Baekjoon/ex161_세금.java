package Baekjoon;

import java.util.Scanner;

public class ex161_세금 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int a = (int)(num*0.78);
		int b = (int)(num*0.8 + (num*0.2)*0.78);
		
		System.out.println(a);
		System.out.println(b);
	}

}
