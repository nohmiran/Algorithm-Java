package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex409_더하기 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine()); // 테스트 개수
		
		for(int i = 0; i < test; i++) {
			int num = Integer.parseInt(br.readLine()); // 숫자 개수
			int sum = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
            
			for(int j = 0; j < num; j++) {
				sum += Integer.parseInt(st.nextToken());
			}
			System.out.println(sum);
		}
	}
}
