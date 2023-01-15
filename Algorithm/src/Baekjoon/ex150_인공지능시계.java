package Baekjoon;

import java.util.Scanner;

public class ex150_인공지능시계 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        int hour = sc.nextInt(); // 시
        int minute = sc.nextInt(); // 분
        int second = sc.nextInt(); // 초
        
        int time = sc.nextInt(); // 요리하는데 필요한 시간
        
        second += time;
        minute += second/60;
        second %= 60;
        hour += minute/60;
        minute %= 60;
        hour %= 24; // 24시 이상의 수가 나온다면 24로 나눠 0시부터 다시 셀 수 있게 한다.
        
        // 요리가 종료되는 시간 출력
        System.out.println(hour + " " + minute + " " + second);

	}

}
