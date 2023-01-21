package Baekjoon;

import java.util.Scanner;

public class ex156_한수 {

	public static void main(String[] args) {
		
		// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
		// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
		// N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //숫자입력
		int count = 0; //한수 개수
		
		for (int i = 1; i <= num; i++) {
			
			if (i <= 99) { // 1부터 99까지는 모두 한수
				
				count += 1;
				
			} else if (i <= 999) { //100부터는 조건을 확인해서 한수 조건을 충족하면 +1
				
				String[] arr = Integer.toString(i).split(""); //각 자리수에 대한 문자열 배열
				
				// 백의자리[2], 십의자리[1], 일의자리[0]
				// [1]-[0] == [2]-[1] 이면 한수이므로 +1
				if ((Integer.parseInt(arr[1]) - Integer.parseInt(arr[0])) 
						== (Integer.parseInt(arr[2])- Integer.parseInt(arr[1]))) { 
					count += 1;
				}
			}
		}
		System.out.println(count);

	}

}
