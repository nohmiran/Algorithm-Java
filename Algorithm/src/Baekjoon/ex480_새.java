package Baekjoon;

import java.util.*;

public class ex480_새 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int bird = 1;
        int count = 0;

        while (num >= 1) {
            if (num < bird) {
                bird = 1;
            }
            num -= bird;
            bird++;
            count++;
        }
        System.out.println(count);
    }
}
