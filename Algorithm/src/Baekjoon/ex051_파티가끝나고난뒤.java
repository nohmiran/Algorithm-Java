package Baekjoon;

import java.util.*;
import java.io.*;

public class ex051_파티가끝나고난뒤 {
	public static void main(String[] args) {

		// 첫째 줄에 1m2당 사람의 수 L (1 ≤ L ≤ 10)과 파티가 열렸던 곳의 넓이 P (1 ≤ P ≤ 1000)가 주어진다.
		// 사람의 수 L
		// 파티가 열렸던 곳의 넓이 P

		// 말하기 쉽게 대충 1미터제곱을 1평이라고 쳤을 때
		// 1평당 1명이 있었다고 하면 5평당 5명, 10평당 10명
		// 1평당 5명이 있었다고 하면 5평에는 25명, 10평에는 50명?
		// -> 사람 수 * 파티장 넓이 만 계산하면 첫째줄은 해결되는건가

		// 둘째 줄에는 각 기사에 실려있는 참가자의 수가 주어진다. 106보다 작은 양의 정수 5개가 주어진다.
		// 양의 정수 5개?
		// 뭔말이여 참가자 수를 출력하면 되는건가
		Scanner sc = new Scanner(System.in); // 스캐너 호출

		// 첫째줄에 다섯개 숫자 출력: 상근이가 계산한 참가자의 수와 각 기사에 적혀있는 참가자의 수의 차이
		int[] result = new int[5];

		int L = sc.nextInt(); // 사람 수 L 
		int P = sc.nextInt(); // 파티장 넓이 P
		int person = L * P; // 참가자 수

		for (int i = 0; i < 5; i++) { 
	
			int newspaper = sc.nextInt(); // 신문 5개에 파티에 온 사람 수가 적혔스
			
			result[i] = newspaper - person; // 신문에 나온 사람 수랑 진짜 사람 수랑 얼마나 차이가 나능가

			System.out.print(result[i]+" "); // 출력?
		}
	}
}
