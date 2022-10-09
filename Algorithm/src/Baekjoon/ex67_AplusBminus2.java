package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex67_AplusBminus2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// A, B 선언
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// System.out.println(A + B);
		bw.write(A + B + ""); // String 형태로 출력해주기 위해 공백을 더한다.
		// BufferedReader, BufferedWriter는 문자열을 다루는 클래스이기 때문,
		// int형으로 입 출력을 할 수 없기 때문에 형변환이 필요.
	

		bw.flush();
		bw.close();
	}

}