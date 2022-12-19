package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex125_긴자리계산 {

	public static void main(String[] args) {
		
		// 1000자리? 그렇다면 자료형은 무조건 BigInteger..!
		Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();

        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));

	}

}
