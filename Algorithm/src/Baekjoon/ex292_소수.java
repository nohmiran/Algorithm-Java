package Baekjoon;

import java.util.Scanner;

public class ex292_소수 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

		int m = Integer.parseInt(sc.nextLine());
		int n = Integer.parseInt(sc.nextLine());
		int sum = 0;
		int min = n;

		for(int i = m; i <= n; i++) {
			int result = 0;
			if(i == 1) {
                result++;
            }
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					result++;
					break;
				}
			}
			if(result == 0) {
				sum += i;
				if(min > i) {
					min = i;
				}
			}
		}		
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);	
		}
	}
}
