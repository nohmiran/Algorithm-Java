package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class ex57_좋은암호 {

	public static void main(String[] args) throws IOException {

		// 1. 숫자 입력 받고,
		
		
		// BufferedReader과 StringTokenizer 호출
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// K에 10의 100제곱을 담으려면 int, long보다 더 큰 데이터 타입이 필요하다.
		// BigInteger은 문자열 형태로 이루어져 있어 숫자의 범위가 무한하기에 어떠한 숫자이든지 담을 수 있다
		BigInteger K = new BigInteger(st.nextToken());
		BigInteger L = new BigInteger(st.nextToken());
		
//		int K = Integer.parseInt(st.nextToken()); 
//		int L = Integer.parseInt(st.nextToken());

		// 인수분해 소수가 L보다 작을 경우 해당 소수 저장할 변수
		int N = 0;

		for (int i = 2; i < L.intValue(); i++) { 
		// L.intValue() : i는 int, L은 BigInteger 타입이기 떄문에 형변환.

			// K에 i를 나눠서 나머지가 0이 나오면 이라는 조건을 사용
//			if (K % i == 0) {
			if ((K.remainder(BigInteger.valueOf(i))).compareTo(BigInteger.ZERO) == 0) { // 솔직히 이건 뭔지 모르게씀..
				N = i;
				break;
			}
		}
		
		// 삼항연산자
		// N이 0보다 클 경우 "BAD"와 N값 출력
		// N이 0보다 작은 경우 "GOOD" 출력
		String S = (N > 0) ? ("BAD " + N) : "GOOD";

		System.out.println(S);
	}
}
