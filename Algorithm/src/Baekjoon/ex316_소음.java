package Baekjoon;

import java.math.BigInteger;
import java.util.*;

public class ex316_소음 {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = new BigInteger(sc.nextLine());
        String operator = sc.nextLine(); // 연산자
        BigInteger num2 = new BigInteger(sc.nextLine());

        if(operator.equals("*")) { // 곱셈
            System.out.println(num1.multiply(num2));
        } 
        if(operator.equals("+")) { // 덧셈
            System.out.println(num1.add(num2));
        }
    }
}
