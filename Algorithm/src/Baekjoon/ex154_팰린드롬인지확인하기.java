package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ex154_팰린드롬인지확인하기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine(); // 한 줄 입력받기

		// 문자를 뒤집어주는 reverse 메서드는 StringBuilder 또는 StringBuffer 클래스에서만 사용할 수 있기 때문에
		// StringBuilder에 str을 담아준다
		StringBuilder sb = new StringBuilder(str);

		if (str.equals(sb.reverse().toString())) { // str을 담은 sb를 뒤집었을 때(reverse) 원래의 str과 같다면 1을 출력

			System.out.print(1);

		} else { // 같지 않다면 0을 출력

			System.out.print(0);

		}
	}
}
