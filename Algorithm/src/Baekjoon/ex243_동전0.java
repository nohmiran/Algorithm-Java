package Baekjoon;

import java.util.Scanner;
 
public class ex243_동전0 {
 
	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		int sum = in.nextInt();
		int[] coin = new int[num];
		
		for(int i = 0; i < num; i++) {
			coin[i] = in.nextInt();
		}
		int count = 0;
 
		for(int i = num - 1; i >= 0; i--) {
 
			if(coin[i] <= sum) {
				count += (sum / coin[i]);
				sum = sum % coin[i];
			}
		}
		System.out.println(count);
	}
}
