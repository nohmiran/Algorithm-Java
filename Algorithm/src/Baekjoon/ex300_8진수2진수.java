package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class ex300_8진수2진수 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        BigInteger num = sc.nextBigInteger(8);
        
        System.out.println(num.toString(2));
    }
}
