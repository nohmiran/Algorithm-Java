package Baekjoon;

import java.util.Scanner;

public class ex579_돌게임 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean turn = true;
        
		while(true) {
			if(n == 1 || n == 3) {
                break;
            }
			if (n - 3 >= 1) {
                n -= 3;
            } else if (n - 1 >= 1) {
                n -= 1;
            }
			turn = !turn; // 차례 바꿔주기
		}
		if(turn) {
            System.out.println("SK");   
        } else {
            System.out.println("CY");
        }
    }
}
