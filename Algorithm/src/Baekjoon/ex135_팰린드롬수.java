package Baekjoon;

import java.util.Scanner;

public class ex135_팰린드롬수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		while (true) {
			int num = sc.nextInt();
		
			if (num == 0) {
				break;
			
			} else {
				int count = 0;
				String str = Integer.toString(num);
				
				for (int i = 0; i < str.length() / 2; i++) {
				
					if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
					
						count++;
					}
				}
				if (count == str.length() / 2) {
					System.out.println("yes");

				} else {
					System.out.println("no");
				}
			}
		}
	}

}
