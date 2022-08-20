package Baekjoon;

import java.util.Scanner;

public class ex20_알람시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt(); // 시
		int min = sc.nextInt(); // 분

		if (min < 45) { // 입력된 수가 45보다 작은 수이면
			hour--; // 1시간을 빼주고,
			
			min = 60 - (45 - min); // 분은 45분에서 뺀 나머지만을 60분에서 빼줘

			if (hour < 0) { // 만약 시가 0보다 작다면 23시로..!
				hour = 23;
			}
			System.out.println(hour + " " + min);
		} else {
			System.out.println(hour + " " + (min - 45));
		}

	}

}
