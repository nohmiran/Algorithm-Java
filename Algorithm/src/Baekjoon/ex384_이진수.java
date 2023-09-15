package Baekjoon;

import java.util.Scanner;

public class ex384_이진수 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
        
		for(int i = 0; i < test; i++) {
			int n = sc.nextInt();
            int m = 0;
			while(n > 0) {
				if(n % 2 == 1){
					System.out.print(m+" ");
        }
        n /= 2;
				m++;
			}
			System.out.println();
		}
	}
}
