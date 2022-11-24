package Baekjoon;
import java.util.Scanner;

public class ex038_2007년 {

		 public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x, y = 0;
			int[] day = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
			String[] week = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };

			x = sc.nextInt();
			y = sc.nextInt();

			for (int i = 0; i < x - 1; i++) { // 배열 인덱스는 0부터 시작하니까 x에서 -1해주기
				y += day[i]; // 입력된 날까지 모든 날짜를 더해준 뒤
			}

			y = y % 7; // 7로 나눈 나머지에 해당하는
			System.out.println(week[y]); // 인덱스를 찾는다(요일 출력)
		}
	}

