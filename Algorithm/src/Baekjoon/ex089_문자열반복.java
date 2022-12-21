package Baekjoon;

import java.util.Scanner;

public class ex089_문자열반복 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt(); // 문제 수
		for (int i = 0; i < test; i++) {

			int num = sc.nextInt(); // 문자를 반복할 수
			String str = sc.next(); //
			// nextLine는 엔터를 치기 전까지의 문자를 인식하기 때문에 공백까지도 인식을 할 수 있음 -> error!
			// next는 문자열, 단어별로 인식을 하기 때문에 공백까지 합쳐서

			for (int j = 0; j < str.length(); j++) {

				for (int k = 0; k < num; k++) { // num만큼 반복 출력

					System.out.print(str.charAt(j));
				}
			}

			System.out.println();
		}
	}

}
