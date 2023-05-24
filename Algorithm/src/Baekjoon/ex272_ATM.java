package Baekjoon;

import java.util.*;

public class ex272_ATM {

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int num = sc.nextInt();
		int[] line = new int [num];
		int sum = 0;
		int temp = 0;
        
		for(int i = 0; i < num; i++) line[i] = sc.nextInt();
		Arrays.sort(line);
        
		for(int i : line) {
			temp += i;
			sum += temp;
		}
		System.out.println(sum);
	}
}
