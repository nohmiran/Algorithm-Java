package Baekjoon;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ex186_진법변환2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int arithmetic = sc.nextInt();

		ArrayList<Character> arr = new ArrayList<>();

		while (num > 0) {
			if (num % arithmetic < 10)
				arr.add((char) (num % arithmetic + '0'));
			else
				arr.add((char) (num % arithmetic - 10 + 'A'));
			num /= arithmetic;
		}
		for (int i = arr.size() - 1; i >= 0; i--)
			System.out.print(arr.get(i));

	}

}
