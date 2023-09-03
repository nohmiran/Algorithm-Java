package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex372_TGN {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()); // r은 광고를 하지 않았을 때 수익
			int e = Integer.parseInt(st.nextToken()); // e는 광고를 했을 때의 수익
			int c = Integer.parseInt(st.nextToken()); // c는 광고 비용
			
            int result = e - r - c;
			if(result == 0) {
				System.out.println("does not matter");
			}else if(result > 0) {
				System.out.println("advertise");
			}else {
				System.out.println("do not advertise");
			}
		}
	}
}
