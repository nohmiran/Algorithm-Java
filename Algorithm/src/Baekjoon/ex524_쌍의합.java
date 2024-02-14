package Baekjoon;

import java.util.*;

public class ex524_쌍의합 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int test = sc.nextInt();
        
		for(int t = 0; t < test; t++) {
			int n = sc.nextInt();
            int left = 1;
            int right = n - left;
            
			      sb.append("Pairs for " + n + ": ");
            
			while(left < right) {
				sb.append((left++) + " " + (right--));
                
				if(left < right)
					sb.append(", ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
