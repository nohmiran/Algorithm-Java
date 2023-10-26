package Baekjoon;

import java.util.Scanner;

public class ex423_계산기프로그램 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		while(true) {
			sc.nextLine();
            
			char c = sc.nextLine().charAt(0);
            
			if(c == '='){
				break;
      }
			int num = sc.nextInt();
            
			switch(c){
				case '+':
            result += num; 
            break;
				case '-':
            result -= num; 
            break;
				case '*':
            result *= num; 
            break;
				case '/':
            result /= num; 
            break;
			}
		}
		System.out.println(result);
	}
}
