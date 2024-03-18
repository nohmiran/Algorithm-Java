package Baekjoon;

import java.util.*;

public class ex550_5의수난 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        int result = 0;
        
		while(num > 0) {
			int t = num % 10;
			num /= 10;
			result += Math.pow(t, 5);
		}
		System.out.println(result);
	}
}
