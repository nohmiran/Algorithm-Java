package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class ex309_단어뒤집기 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < test; i++) {
			String str = sc.nextLine();
			String[] arr = str.split(" ");

			for(int j =0; j < arr.length; j++) {
				arr[j] = new StringBuffer(arr[j]).reverse().toString();
			}
			System.out.println(String.join(" ", arr));
		}
	}
}
