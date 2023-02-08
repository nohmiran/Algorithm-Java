package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex172_코딩은체육과목입니다 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// string으로 입력된 br Integer로 강제 형변환
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		// 그리고 이를 4로 나누고, 나눈 만큼 long을 출력
		// repeat 메소드를 쓰려 했는데 하 씨 안된다 
		// 자바 11버전부터 안된다고 한다.
		for (int i = 0; i < num / 4; i++) {
			sb.append("long ");
		}
		
		// 맨 끝에는 int를 출력하기 위해 append 메소드 쓰기
		sb.append("int");
		
		// 출력
		System.out.println(sb);
	}

}
