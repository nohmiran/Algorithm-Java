package 과제;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ex05_Collectionsort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		int[] num = new int[5]; // 5개 칸 만들기

		for (int i = 0; i < num.length; i++) { // num의 길이(=5)만큼
			num[i] = sc.nextInt();

			list.add(num[i]); // 입력된 값을 list에 차례대로 담아주기
		}

		Collections.sort(list); // Collections.sort : 리스트 정렬
		System.out.println(list + " ");
		
	}

}