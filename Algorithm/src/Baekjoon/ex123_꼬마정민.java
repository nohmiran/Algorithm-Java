package Baekjoon;

import java.util.Scanner;

public class ex123_꼬마정민 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 10에 12승이면 int로 성에 안 찰 수 있으니 데이터 타입은 long을 써야지.
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		System.out.println(a + b + c);

	}

}
