package Baekjoon;

import java.util.Scanner;

public class ex424_도미노 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();        
        int sum = 0;
        
        for(int i = 0; i <= n; i++) {
            for(int j = i; j <= n; j++) {
                sum += i + j;
            }
        }
        System.out.println(sum);
    }
}
