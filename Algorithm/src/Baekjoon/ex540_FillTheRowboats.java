package Baekjoon;

import java.util.Scanner;

public class ex540_FillTheRowboats {
    
	public static void main(String[] args) throws Exception {
        
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
			if(i % 6 == 0) {
				System.out.print("Go! ");
			}
			else if(i == num) {
				System.out.print("Go! ");
			}
		}
	}
}
