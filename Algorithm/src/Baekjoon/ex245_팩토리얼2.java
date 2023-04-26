package Baekjoon;

import java.util.Scanner;

public class ex245_팩토리얼2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num = sc.nextInt();
        long fac = 1;

        for(int i = 1; i <= num; i++){
                fac *= i;
        }

        System.out.println(fac);
    }    
}
