package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex239_명령프롬프트 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int file = Integer.parseInt(br.readLine()); // 파일 이름 개수
		String fileName = br.readLine(); // 파일 이름

		char[] result = fileName.toCharArray();

		if (file > 1) {

			for (int i = 0; i < file - 1; i++) {

				String str = br.readLine();

				for (int j = 0; j < str.length(); j++) {

					if (result[j] != '?') {

						if (result[j] != str.charAt(j)) {
							result[j] = '?';
						}
					} else {
						continue;
					}
				}
			}
		}
		System.out.println(result);
	}
}
