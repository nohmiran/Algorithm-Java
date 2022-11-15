package Baekjoon;

import java.util.Scanner;

public class ex94_CAPS {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		// toUpperCase()는 소문자를 대문자로 바꿔주는 함수
		// ** toLowerCase()는 대문자를 소문자로 바꿔주는 함수
		input = input.toUpperCase(); 
		
		System.out.println(input);
	}

}
