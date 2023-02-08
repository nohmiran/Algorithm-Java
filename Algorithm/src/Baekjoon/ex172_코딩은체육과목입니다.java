package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex172_코딩은체육과목입니다 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		// string으로 입력된 br Integer로 강제 형변환
//        int n = Integer.parseInt(br.readLine()) / 4;
//        // 그리고 이를 4로 나누고, 나눈 만큼 long을 출력
//        // 맨 끝에는 int를 출력.
//        int str="long ".repeat(n); 
//        System.out.print( + "int");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
	}

}
