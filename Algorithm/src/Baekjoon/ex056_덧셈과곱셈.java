package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex056_덧셈과곱셈 {
	public static void main(String[] args) throws IOException {

		// 등차수열? : 연속하는 두 항의 차이가 모두 일정한 수열
		// (1+2+…+a) * (1+2+…+(a+1)) * … * (1+2+…+(b-1)) * (1+2+…+b)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		int temp = (a + 1) * a / 2;
		int result = 14579; // 결과가 커질 수 있으니 14579로 나누기

		temp %= result;

		int answer = temp;

		for (int i = a + 1; i <= b; i++) {
			// answer = (temp + i) * answer
			answer *= (temp += i);

			// answer = answer % MOD
			answer %= result;
		}
		System.out.println(answer);
	}

}