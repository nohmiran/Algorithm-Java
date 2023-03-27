package Baekjoon;

import java.util.Scanner;
 
public class ex218_상수{
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
        
        // 입력 받은 수를 문자열로 변환하고 뒤집은 다음 다시 Integer형태로 변환
		num1 = Integer.parseInt(new StringBuilder().append(num1).reverse().toString());
		num2 = Integer.parseInt(new StringBuilder().append(num2).reverse().toString());
		
        // num1이 num2보다 크다면 num1 출력. 그렇지 않다면 num2 출력
		System.out.print(num1 > num2 ? num1 : num2);
	
	}
}
