package Baekjoon;

import java.util.Scanner;

public class ex519_SASA모형을만들어보자 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
		System.out.println(Math.min(n / 2, m / 2));
	}
}
