package Baekjoon;

import java.util.Scanner;
 
public class ex328_직각삼각형 {

  public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
       
        while(true) {
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	int num3 = sc.nextInt();
        	
			// 마지막 줄에는 0 0 0 입력
        	if(num1 == 0 && num2 == 0 && num3 == 0) {
                break;
            }
            // 직각삼각형의 조건 : num1 제곱 * num2 제곱 == num3 제곱
            // 직각삼각형이라면 "right", 아니라면 "worng"
        	if((num1 * num1 + num2 * num2) == num3 * num3) {
				System.out.println("right");
			}
        	else if(num1 * num1 == (num2 * num2 + num3 * num3)) {
				System.out.println("right");
			}
        	else if(num2 * num2 == (num3 * num3 + num1 * num1)) {
				System.out.println("right");
			}
        	else {
				System.out.println("wrong");
			}
		}
	}
}
