package Baekjoon;

import java.util.Scanner;

public class ex576_분수찾기 {
    
    public static void main(String [] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = 1;
        int s = 0;

        while (n > s + l) {
            s += l++;
        }
      
        if (l % 2 == 1) { // 홀수일 경우 분자와 분모 출력
            System.out.println((l - (n - s - 1)) + "/" + (n - s));
        } else { // 짝수일 경우 분자와 분모 출력
            System.out.println((n - s) + "/" + (l - (n - s - 1)));
        }
    }
}
