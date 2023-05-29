package Baekjoon;

import java.util.Scanner;

public class ex275_최소공배수 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			
			int maxNum = Math.max(num1, num2);
			int minNum = Math.min(num1, num2);
			
			int k = 1;
			int result = 0;
			
			while(true) {
				if((maxNum * k) % minNum == 0) {
					result = (maxNum * k);
					break;
				}
				else {
					k++;
				}
			}
			System.out.println(result);
		}
	}
}
