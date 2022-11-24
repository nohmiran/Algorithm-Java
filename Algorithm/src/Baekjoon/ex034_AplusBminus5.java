package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex034_AplusBminus5 {

	public static void main(String[] args) throws IOException {

		// 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 출력
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			// num1과 num2를 분리하기 위해 StringTokenizer를 사용.
			StringTokenizer str = new StringTokenizer(br.readLine()); 

			int num1 = Integer.valueOf(str.nextToken());
			int num2 = Integer.valueOf(str.nextToken());

			if (num1 == 0 && num2 == 0) {
				break;
			}
			bw.write(num1 + num2 + "\n");
		}
		
		bw.flush(); // 버퍼에 남아있는 데이터를 모두 출력(버퍼를 클린하게!)
		bw.close();

	}

}
