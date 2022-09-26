package Baekjoon;

import java.util.Scanner;

public class ex54_사장님도박은재미로하셔야합니다 {
	public static void main(String[] args) {

		// 야바위의 수가 더해지는 변수를 하나 지정하고,
		// -1이 입력되면 윤성이가 자리를 뜬 것이니까
		// -1이 입력된다면 멈추게 하면 되겠지

		// 입력하기 위해 Scanner 호출
		Scanner sc = new Scanner(System.in);

		int sum = 0; // 누적합산할 변수

		while (true) {
			
			int num = sc.nextInt(); // 계속 숫자가 입력되도록 while문에 넣어두고
			
			if (num == -1) { // -1이 입력되면 멈추도록 break를 걸어준다.
				break;
			}
			
			sum += num; // 입력된 수를 계속 계속 계속 더해준다
		}
		System.out.println(sum); // 윤성이가 베팅한 돈의 합 출력
	}

}
