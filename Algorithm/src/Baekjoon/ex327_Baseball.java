package Baekjoon;

import java.util.*;

public class ex327_Baseball {
    
	public static void main(String[] args) throws Exception{
        
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
        
		for(int i = 0; i < test; i++) {
			int y = 0; // 연세대 득점
            int k = 0; // 고려대 득점
            
			for(int j = 0; j < 9; j++) {
				y += sc.nextInt();
				k += sc.nextInt();
			}
            // 비겼다면 Draw, 연세대가 이기면 Yonsei, 고려대가 이기면 Korea
			System.out.println(y == k? "Draw" : y > k? "Yonsei" : "Korea");
		}
	}
}
