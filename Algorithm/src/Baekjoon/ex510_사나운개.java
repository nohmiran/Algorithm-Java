package Baekjoon;

import java.util.Scanner;

public class ex510_사나운개 {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt();
		int b = sc.nextInt(); 
		int c = sc.nextInt(); 
		int d = sc.nextInt();
		
		int[] arr = new int[3];
		for(int i = 0; i < 3; i++) { 
			arr[i] = sc.nextInt();
		}
		
		int result;
		for(int i = 0; i < 3; i++) {
			result = 0;
			if(arr[i] % (a + b) > 0 && arr[i] % (a + b) <= a) {
				result++;
			}
			if(arr[i] % (c + d) > 0 && arr[i] % (c + d) <= c) {
				result++;
			}
			System.out.println(result);
		}
	}
}
