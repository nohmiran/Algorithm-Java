package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex353_세제곱의합 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        
        for (int i = 1; i <= num; i++) {
            result += i;
        }

        System.out.println(result);
        System.out.println(result * result);
        System.out.println(result * result);

        br.close(); 
    }
}
