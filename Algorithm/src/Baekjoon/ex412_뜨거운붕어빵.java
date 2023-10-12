package Baekjoon;

import java.util.Scanner;

public class ex412_뜨거운붕어빵 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            String reversed = new StringBuilder(input).reverse().toString(); // 뒤집기
            System.out.println(reversed);
        }
    }
}
