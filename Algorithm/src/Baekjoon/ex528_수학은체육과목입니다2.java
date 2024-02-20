package Baekjoon;

import java.util.*;

public class ex528_수학은체육과목입니다2 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        n = n % 8;
        if (n == 1) {
            System.out.println(1);
        } else if (n == 5) {
            System.out.println(5);
        }else if (n == 2 || n == 0) {
            System.out.println(2);
        }else if (n == 3 || n == 7) {
            System.out.println(3);
        }else {
            System.out.println(4);
        }
    }
}
