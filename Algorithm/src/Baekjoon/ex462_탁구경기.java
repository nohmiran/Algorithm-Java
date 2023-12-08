package Baekjoon;

import java.io.*;

public class ex462_탁구경기 {
    
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int game = Integer.parseInt(br.readLine()); // 경기 수 
		int x = 0; // 달구의 점수
		int y = 0; // 포닉스의 점수
        
		while (game-- > 0) {
			char c = br.readLine().charAt(0); 
			if (c == 'D') {
				x++;
			} else if (c == 'P') {
				y++;
			}
			if (Math.abs(x - y) == 2) {
				break;
			}
		}
		System.out.print(x + ":" + y); // 경기가 몇 대 몇으로 끝나는지
	}
}
