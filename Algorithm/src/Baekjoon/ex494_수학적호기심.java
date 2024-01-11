package Baekjoon;

import java.util.*;

public class ex494_수학적호기심 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        
        for(int i = 0; i < test; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int result = 0;
            
            for(int j = 1; j < n - 1; j++) {
                for (int b = j + 1; b < n; b++) {
                    if ((j * j + b * b + m) % (j * b) == 0) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
