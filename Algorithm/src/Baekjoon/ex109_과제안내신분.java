package Baekjoon;

import java.util.Scanner;

public class ex109_과제안내신분 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] student = new boolean[31];

		for (int i = 1; i < 29; i++) {
			int success = sc.nextInt(); // 과제 낸 사람의 번호 입력
			student[success] = true; // 과제 낸 사람의 index에는 true를 담아주고
		}
		for (int i = 1; i < student.length; i++) {
			if (student[i] == false) // index에 
				System.out.println(i); // false인 사람만 출력!
		}

	}

}
