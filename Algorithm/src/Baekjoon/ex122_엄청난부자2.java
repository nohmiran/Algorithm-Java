package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex122_엄청난부자2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        
        // BigInteger클래스에 있는 
        // divide 함수 -> 나눈 값
        // remainder 함수 -> 나머지 값
        System.out.println(num1.divide(num2));
        System.out.println(num1.remainder(num2));
	}

}
