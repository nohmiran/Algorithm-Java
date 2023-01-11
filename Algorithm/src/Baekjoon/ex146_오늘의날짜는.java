package Baekjoon;

import java.util.Calendar;

public class ex146_오늘의날짜는 {

	public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
			
			System.out.println(cal.get(cal.YEAR));
			
			System.out.println(cal.get(cal.MONTH)+1); // calendar 클래스에서의 달은 0부터 11월까지
			
			System.out.println(cal.get(cal.DATE));
			

	}

}
