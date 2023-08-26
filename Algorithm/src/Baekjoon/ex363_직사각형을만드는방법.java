package Baekjoon;

import java.util.Scanner;

public class ex363_직사각형을만드는방법 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i * j <= n)
					count++;
			}
		}
		System.out.println(count);
	}
}
