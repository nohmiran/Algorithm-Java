package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex171_한글2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// '가'가 1로 출력이 되어야 함
		// '가'의 아스키코드는 44032이기 때문에 44031을 빼준다.
		int num = br.readLine().charAt(0) - 44031;

		// 글자가 몇 번째인지
		System.out.println(num);

	}

}
