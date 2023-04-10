package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex234_알고리즘수업_알고리즘의수행시간3 {
    
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
       
        Long n = Long.parseLong(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        sb.append(n*n).append("\n").append(2);
        
        System.out.print(sb);
    }

}
