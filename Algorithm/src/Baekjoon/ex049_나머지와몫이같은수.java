package Baekjoon;

import java.util.Scanner;

public class ex049_나머지와몫이같은수 {
	public static void main(String[] args) {

		// N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합..

		// N = 1일때는 다 나머지 0으로 떨어지니께 몫과 나머지가 같은건 없음
		// N = 2일때는 3, 합은 3
		// N = 3 -> 4,8, 합은 12
		// N = 4 -> 5,10,15, 합은 30
		// N = 5 -> 6, 12, 18, 24 합은...60.....
		// N의 수보다 +1인 숫자와 그 숫자의 배수가 범인이고
		// N의 수가 나머지로는 나올 수 없는 규칙이 있다!!!!!!!!!!!!!!!!!!!!!!!!

		// 푸러보자.
		
		// 1. 입력받기 위해 스캐너 호출
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();
		long sum = 0; // 자연수의 합 넣을 변수

		// 2. 배수를 뽑아내기 위해 구구단을 생각하며 for문 사용..
		for (int i = 1; i < N; i++) { 
			// 주의) i가 N과 같아선 안된다. 
			// 몫 == 나머지여야 하는데 나머지가 N이면 한 번 더 나눠부러야제
			// 그러기 때문에 i는 N보다 무조건 작아야한다. 
			
			sum += (N + 1) * i;
			// N이 5일 때 (5+1) * 1...2....3...4...
			// 그리고 sum += 으로 sum에 누적해서 더해준다

		}
		System.out.println(sum);

	}

}
