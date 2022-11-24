package Baekjoon;

import java.util.Scanner;

public class ex036_더하기사이클 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int count = 0;

		while (true) {
			int first = temp / 10; // 입력값을 10으로 나눠 앞자리와
			int second = temp % 10; // 입력값을 10으로 나눠 뒷자리를 나눠준다

			temp = second * 10 + (first + second) % 10;
			// 뒷자리에 10을 곱해 앞자리로 만들고
			// 앞자리와 뒷자리 수를 더한 수의 뒷자리 수만 구하기 위해 10으로 나눠 나머지를 뒷자리로 만들어
			// 두 수를 더해준다
			count++; // 사이클 수를 더하기 위해 셈이 될 때마다 카운트 수를 구해주고
			
			if (num == temp) { // 입력값과 temp가 같을 때 브레이크!
				break;
			}
		}
		System.out.println(count);
	}

}