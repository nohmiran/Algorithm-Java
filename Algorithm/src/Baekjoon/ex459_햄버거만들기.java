package Baekjoon;

import java.util.Scanner;

public class ex459_햄버거만들기 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
		int bread = sc.nextInt();
		int patty = sc.nextInt();
        
		int result = bread / 2;
        
		if(bread < 2){
			result = 0;
		} else if(result > patty){
			result = patty;
		}
       
        System.out.print(result);
	}
}
