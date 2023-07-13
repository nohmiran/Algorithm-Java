package Baekjoon;

import java.util.Scanner;

public class ex320_적어도대부분의배수 {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int count = 0;
		int result = 1;
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		while(true) {
			count = 0;
			for(int i = 0; i < 5; i++) {
				if( result % arr[i] == 0 ) {
                    count++;
                }
			}
			if(count >= 3) {
                break;
            }
			result++;		
		}
		System.out.println(result);
	}
}
