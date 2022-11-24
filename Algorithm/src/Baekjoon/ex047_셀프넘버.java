package Baekjoon;

public class ex047_셀프넘버 {
	public static void main(String[] args) {
		
		int[] arr = new int[10001]; // 셀프넘버 체크
		
		for (int i = 0; i < arr.length - 1; i++) { // 0부터 10000까지 셀프 넘버가 아니면 1 넣기
			
			int n = self(i);
			
			if (n < 10001) {
				arr[n] = 1;
			}

		}
		for (int j = 0; j < arr.length - 1; j++) { // 배열을 돌면서 셀프넘버 출력
			
			if (arr[j] == 0) {
				System.out.println(j);
			}
		}
	}

	public static int self(int num) {

		int sum = num; // 매개변수로 초기화

		while (num != 0) {
			sum += num % 10; // 마지막 자리 숫자(나머지)구해서 sum에 더해주기
			num /= 10; // 나머지를 제외한 몫 구하기
			// 반복
			// ex) 입력값 :123
			// 1-1. num값으로 초기화(123) + 마지막 자리 숫자(3)
			// 1-2. 나머지를 제외한 몫 (12)
			// 2-1. 123 + 2
			// 2-2. 1
			// 3-1. 123 + 1
			// 3-2. 0
		}

		return sum;
		// sum = 123 + 3 + 2 + 1
	}

}
