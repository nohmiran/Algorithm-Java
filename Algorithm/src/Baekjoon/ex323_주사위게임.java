package Baekjoon;

import java.util.*;

public class ex323_주사위게임 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		
        int num = sc.nextInt();
        int result = 0;
		
        for(int n = 0 ;n < num; n++) {
			int a = sc.nextInt(); // 주사위 던져서 나온 눈의 수 a, b, c
            int b = sc.nextInt();
            int c = sc.nextInt();
            int test = 0;
			
            if(a == b && b == c){ // 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금
				test = 10000 + a * 1000;
			} else if(a == b || c == a){ // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
				test = 1000 + a * 100;
			} else if(b == c){ // 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
				test = 1000 + b * 100;
			} else{ // 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
				test = Math.max(Math.max(a, b), c) * 100;
			}
                result = Math.max(test, result);
		}
		System.out.println(result);
	}
}
