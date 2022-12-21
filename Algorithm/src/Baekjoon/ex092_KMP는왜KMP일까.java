package Baekjoon;

import java.util.Scanner;

public class ex092_KMP는왜KMP일까 { 

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		String str1 = sc.next();
		
		String[] word = str1.split("-");
		
		for (int i = 0; i < word.length; i++) {
			String str2 = word[i];
			System.out.print(str2.charAt(0));
		}
		
	}

}
