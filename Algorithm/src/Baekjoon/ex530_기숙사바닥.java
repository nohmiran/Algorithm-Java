package Baekjoon;

import java.util.Scanner;

public class ex530_기숙사바닥 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int b = sc.nextInt();
		int r = sc.nextInt();
		
		for (int i = 1; i <= (r + b) / 2; i++) {
			if ((r + b) % i == 0) {
				int l = (r + b) / i;
				int w = i;
				
				if ( ((l + w - 2) * 2) == b && ((l - 2) * (w - 2)) == r ) {
					System.out.println(l+ " " + w);
					break;
				}
			}
		}
	}
}
