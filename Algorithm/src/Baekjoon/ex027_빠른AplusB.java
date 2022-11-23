package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex027_빠른AplusB {

	public static void main(String[] args) throws IOException {

		// Scanner 대신
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 입력 받기
		int T = Integer.parseInt(br.readLine()); // int 강제형변환
		
		for(int i = 0; i < T; i++) {
			
			//String으로 입력받은 값을 토큰화
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			// 토큰별로 자라서 원하는 int형태로 강제형ㅎ변환
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}

}
