package Baekjoon;

import java.util.*;

public class ex451_주사위 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
        
		int T = sc.nextInt();
        
		for(int x = 1; x <= T; x++){
            System.out.printf("Case %d: %d\n", x, sc.nextInt() + sc.nextInt());
        }
	}
}
