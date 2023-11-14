package Baekjoon;

import java.util.*;

public class ex439_빵 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int result = 9999;
        
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
            int b = sc.nextInt();
			if(a <= b){
				result = Math.min(result, b);
            }
		}
		if(result == 9999) { 
			result = -1;
        }
		System.out.println(result);
	}
}
