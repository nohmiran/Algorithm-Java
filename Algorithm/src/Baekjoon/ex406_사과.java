package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex406_사과 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int school = Integer.parseInt(br.readLine()); // 학교의 수
		int result = 0;
		
		for(int i = 0; i < school; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int student = Integer.parseInt(st.nextToken()); // 각 학교의 학생 수
			int apple = Integer.parseInt(st.nextToken()); // 배정된 사과 개수
			
			result += (apple % student);
		}
		System.out.println(result);
	}
}
