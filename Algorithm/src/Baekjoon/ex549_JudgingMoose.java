package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex549_JudgingMoose {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer a = Integer.parseInt(st.nextToken());
		Integer b = Integer.parseInt(st.nextToken());

		Integer maxValue = Math.max(a, b);
		Integer minValue = Math.min(a, b);
		
		if(maxValue.equals(0)) {
			System.out.println("Not a moose");
		} else if(maxValue.equals(minValue)) {
			System.out.println("Even " + (a + b));
		} else {
			System.out.println("Odd " + (maxValue * 2));
		}
	}
}
