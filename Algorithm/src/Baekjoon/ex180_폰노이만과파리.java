package Baekjoon;

import java.util.Scanner;

public class ex180_폰노이만과파리 {

	public static void main(String[] args) {
		// 두 기차는 200 / (50 * 2) = 2 시간 후에 만난다.
		// 파리는 2시간동안 시간당 75마일의 속도로 이동하므로 2 * 75 = 150 마일을 이동한다.
		// (거리 / (기차 속도 * 2) * 파리 속도)
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt();
		int T = sc.nextInt();
		int D = sc.nextInt();
		
		System.out.println(D / (2 * S) * T);

	}

}
