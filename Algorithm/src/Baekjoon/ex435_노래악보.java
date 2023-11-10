package Baekjoon;

import java.io.*;
import java.util.*;

public class ex435_노래악보 {
    
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st  = new StringTokenizer(br.readLine());

		int music = Integer.parseInt(st.nextToken()); // 악보 수
		int question = Integer.parseInt(st.nextToken()); // 질문 수

		List<Integer> list = new ArrayList<>();

		for (int i = 1; i <= music; i++) {
			int time = Integer.parseInt(br.readLine()); 

			for (int j = 0; j < time; j++) {
				list.add(i); 
			}
		}
		for (int i = 0; i < question; i++) {
			int count = Integer.parseInt(br.readLine());
			bw.write(list.get(count) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
