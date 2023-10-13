package Baekjoon;

import java.util.*;

public class ex413_운동 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 운동을 N분 해야 함
		int m = sc.nextInt(); // 초기 맥박
		int M = sc.nextInt(); // 최대 맥박
		int T = sc.nextInt();  // 운동 후 증가 맥박
    int R = sc.nextInt();  // 휴식 후 감소 맥박
		
		int time = 0;  // 걸린 총 시간
		int heart = m; // 현재 맥박
        
		int result = 0; // 결과
		
		while(time != N) {
			result++; // 시간 증가
			
			// 맥박 < 최대 맥박 = 운동 시작
			if(m + T <= M) { 
				m += T;
				time++;
			} else { // 그렇지 않으면 휴식
				m -= R;
				
				// 맥박 < 초기 맥박 = 초기 맥박으로 세팅
				if(m < heart) m = heart;
			}
			
            // 더 이상 운동할 수 없는 경우(맥박 > 최대 맥박, 맥박 == 초기 맥박)에는 break
			if((m + T > M) && (m == heart))
				break;
		}
		if(time != N)
			System.out.println(-1);
		else
			System.out.println(result);
	}
}
