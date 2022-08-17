package 과제;

import java.util.Arrays;
import java.util.Scanner;

public class ex04_Arraysort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[5]; // 입력 받을 칸 5개
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array); // Array.sort : 배열정렬
		
		System.out.println(Arrays.toString(array));
		
		sc.close();
	} 

}