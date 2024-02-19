package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex526_모기곱셈 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String s = "";
		
		while((s = in.readLine())!=null) {
			
			String[] split = in.readLine().split(" ");
			
			int M = Integer.parseInt(split[0]); // M: 첫째 주 모기 수
			int P = Integer.parseInt(split[1]); // P: 번데기 수
			int L = Integer.parseInt(split[2]); // L: 유충 수
			
			int E = Integer.parseInt(split[3]); // E: 한 모기가 낳는 알의 수 
			
			int R = Integer.parseInt(split[4]); // R: 유충 비율
			int S = Integer.parseInt(split[5]); // S: 번데기 비율
			int N = Integer.parseInt(split[6]); // N: 모기 수를 구하려는 시점 
			
			for(int i = 0; i < N; i++) {
				int tmp = M;
				M = P / S;
				P = L / R;
				L = tmp * E;
			}
			sb.append(M).append("\n");
		}
		System.out.println(sb); // sb: N번 째 일요일 후 모기 수
	}
}
