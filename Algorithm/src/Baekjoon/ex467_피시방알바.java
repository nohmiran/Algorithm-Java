package Baekjoon;

import java.util.*;

public class ex467_피시방알바 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int n = sc.nextInt();
        int result = 0;
		boolean [] check = new boolean [101];
        
		for(int i = 0; i < n; i++) {
			int test = sc.nextInt();
            
			if(!check[test]) {
				check[test]=true;
            } else {
				result++;
            }
		}
		System.out.println(result);
	}
}
