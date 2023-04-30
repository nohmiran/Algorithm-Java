package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex253_삼각형외우기 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());

		if (num1 + num2 + num3 != 180) {
			System.out.print("Error");
		} else {
			if (num1 == 60 && num2 == 60 && num3 == 60) {
				System.out.print("Equilateral");
			} else if (num1 == num2 || num2 == num3 || num3 == num1) {
				System.out.print("Isosceles");
			} else {
				System.out.print("Scalene");
			}
		}
	}
}