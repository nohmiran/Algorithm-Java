package Baekjoon;

import java.io.*;
import java.util.*;

public class ex053_오르막 {

	public static void main(String[] args) {

		// 입력된 수가 오름차순이면 "Good"출력
		// 오름차순이 아니면 "Bad"

		// 1. 수를 입력받아 배열칸에 하나씩 나눠넣고
		// 2. for문으로 첫 번째 칸과 그 다음칸을 비교?
		// ** 그 다음 칸으로 갈수록 수는 커져야 함!

		Scanner sc = new Scanner(System.in);

		String result = "Good"; // "Good"과 "Bad"를 넣기 위한 변수

		String[] str = sc.nextLine().split(" "); // 입력된 숫자를 띄어쓰기로 하나씩 나눠줌.

		for (int i = 0; i < str.length-1; i++) {

			// int num1 = str[i] // -> 데이터 타입이 String이기 때문에 수 비교를 할 수 없음
			
			// int형으로 강제 형변환
			int num1 = Integer.parseInt(str[i]);
			int num2 = Integer.parseInt(str[i + 1]);

			// 입력된 숫자 1과 2 비교
			if (num1 > num2) { // 앞에 수가 크다면 "Bad"
				result = "Bad";
				break;
			}

		}
		System.out.println(result);
	}

}
