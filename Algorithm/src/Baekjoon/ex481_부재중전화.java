package Baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex481_부재중전화 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());	

		int num = Integer.parseInt(st.nextToken()); // 노래의 개수
		int length = Integer.parseInt(st.nextToken()); // 노래의 길이
		int interval = Integer.parseInt(st.nextToken()); // 전화벨 울리는 간격

		int time[] = new int[10000]; // 전화가 오면 +1초
		int second = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < length; j++) {
				time[second++] = 1;
			}
			second += 5; // 노래 사이 5초의 간격
		}
		second = 0;

		while(true) {
			if(time[second] == 0) {
				bw.write(second + "");
				break;
			}
			second += interval; // 간격을 초에 누적
		}
		bw.flush();
		bw.close();
	}
}
