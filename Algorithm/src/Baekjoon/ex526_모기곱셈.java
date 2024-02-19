package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex526_모기곱셈 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			String str = br.readLine();
		
			if (str == null)
				return;
		
			StringTokenizer st = new StringTokenizer(str, " ");
		
			long    M = Long.parseLong(st.nextToken()), //모기의 수
					Mp = M,		//저번 주의 모기 수
					P = Long.parseLong(st.nextToken()), //번데기 수
					L = Long.parseLong(st.nextToken()), //유충 수
					E = Long.parseLong(st.nextToken()), //성충 모기가 낳는 알
					R = Long.parseLong(st.nextToken()), //유충->번데기 몇번째 유충만 사는지
					S = Long.parseLong(st.nextToken()), //번데기->성충 몇번째 번데기만 사는지
					N = Long.parseLong(st.nextToken()); //몇 주가 지난 시점인지
		
			for(int i = 0; i < N; i++) {
				Mp = M;
				M = P / S;
				P = L / R;
				L = Mp * E;
			}
		
			System.out.println(M);
		}
	}
}
